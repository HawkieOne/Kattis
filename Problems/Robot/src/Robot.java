import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

// Jar file for JSON support
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.annotation.*;

/**
 * Simple example of a robot communication interface to the (real or virtual) 
 * robot over a network connection.
 * It uses Java -> JSON -> HttpRequest -> Network -> DssHost32 -> 
 * Lokarria(Robulab) -> MRDS4
 * 
 * Most methods can throw an exception - in this example, they are all thrown out to the 
 * operating system. A real implementation should take care of the different
 * exception types.
 * 
 * This class needs the following Jackson JSON .jar files:
 * jackson-core-2.0.5.jar
 * jackson-databind-2.0.5.jar
 * jackson-annotations-2.0.5.jar
 * 
 * Download them from http://wiki.fasterxml.com/JacksonDownload
 * under Downloads, 2.x.
 * 
 * @author Thomas Johansson, dept. of Computing Science, Ume� University, Ume�, Sweden
 * Mail: thomasj@cs.umu.se
 */

public class Robot
{
	private String host;                // host and port numbers
	private int port;
	private ObjectMapper mapper;        // maps between JSON and Java structures
	private LocalizationResponse lr;
	private LaserEchoesResponse ler;
	private LaserPropertiesResponse lpr;
	private DifferentialDriveRequest dr;


	/*
	 * Create a Robot that can be used to manipulate a simulated (or real) robot
	 * following the MRDS protocol.
	 * host and port are usually 127.0.0.1 and 50000, respectively (port 50000 on the local MRDS
	 * server).
	 */
	public Robot(String host, int port)
	{
		this.host = host;
		this.port = port;

		mapper = new ObjectMapper();

		// Responses from the robot
		lr = new LocalizationResponse();
		ler = new LaserEchoesResponse();
		lpr = new LaserPropertiesResponse();

		// request to the robot
		dr = new DifferentialDriveRequest();
	}

	/*
	 * Query the robot for its heading (direction, in radians, from the x-axis, counterclockwise)
	 */
	public double getHeading() throws Exception
	{
		getResponse(lr);

		double angle = lr.getHeadingAngle();

		return angle;
	}

	/*
	 * Query the robot for its position. Note that the x-axis points 'upwards' (towards the top of the screen)
	 * in MRDS.
	 */
	public double[] getPosition() throws Exception
	{
		getResponse(lr);

		double [] position = lr.getPosition();

		return position;
	}

	/*
	 * Set robot linear speed (m/s) and turn rate (radians/s)
	 */
	public void setMotion(double speed, double turnrate) throws Exception
	{
		dr.setLinearSpeed(speed);
		dr.setAngularSpeed(turnrate);
		
		int rc = putRequest(dr);
	}

	/*
	 * Return laser readings
	 */
	public double[] getLaser() throws Exception
	{
		getResponse(ler);

		double [] echoes = ler.getEchoes();

		return echoes;
	}

	/**
	 * Send a request to the robot.
	 * @param r request to send
	 * @return response code from the connection (the web server)
	 * @throws Exception
	 */
	public int putRequest(Request r) throws Exception
	{
		URL url = new URL(host + ":" + port + r.getPath());

		HttpURLConnection connection = (HttpURLConnection)url.openConnection();

		connection.setDoOutput(true);

		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setUseCaches (false);

		OutputStreamWriter out = new OutputStreamWriter(
				connection.getOutputStream());

		// construct a JSON string
		String json = mapper.writeValueAsString(r.getData());

		// write it to the web server
		out.write(json);
		out.close();

		// wait for response code
		int rc = connection.getResponseCode();

		return rc;
	}

	/**
	 * Get a response from the robot
	 * @param r response to fill in
	 * @return response same as parameter
	 * @throws Exception
	 */
	public Response getResponse(Response r) throws Exception
	{
		URL url = new URL(host + ":" + port + r.getPath());

		// open a connection to the web server and then get the resulting data
		URLConnection connection = url.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(
				connection.getInputStream()));

		// map it to a Java Map
		Map<String, Object> data = mapper.readValue(in, Map.class);
		r.setData(data);

		in.close();

		return r;
	}


}
