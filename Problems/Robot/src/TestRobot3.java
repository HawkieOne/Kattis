
/**
 * TestRobot3 tests the Robot class
 * It uses Java -> JSON -> HttpRequest -> Network -> DssHost32 -> Lokarria(Robulab) -> Core -> MRDS4
 * 
 * @author thomasj
 * @date 2019-08-29
 * 19-09-04 Added example of reading a path
 */
public class TestRobot3
{
   private Robot robot;

   /**
    * This simple main program creates a robot, sets up some speed and turning rate and
    * then displays angle and position for 16 seconds.
    * @param args         not used
    * @throws Exception   not caught
    */
   public static void main(String[] args) throws Exception
   {     
      // read a path file
      Path p = new Path("Path-around-table-and-back (2).json");
      Position[] positions = p.getPath();
      System.out.println("Path length: " + positions.length);
      System.out.println("First pos:   " + positions[0].getX() + ", " + positions[0].getY());

      Robot robot = new Robot("http://127.0.0.1", 50000);

      // set up the request to move in a circle
      robot.setMotion(0.2, 0.2);

      for (int i = 0; i < 16; i++)
      {
         try
         {
            Thread.sleep(1000);
         }
         catch (InterruptedException ex) {}

         if(i % 2 == 0){
            robot.setMotion(2, -0.4);
         }
         else{
            robot.setMotion(0.2, 0.4);
         }
         // ask the robot about its position and angle
         double position[] = robot.getPosition();
         System.out.println("position = " + position[0] + ", " + position[1]); 

         double angle = robot.getHeading();
         System.out.println("heading = " + angle);
      }

      double[] echos = robot.getLaser();
      for (int i = 0; i < echos.length; i++)
      {
    	  if ((i % 20) == 0) System.out.println();
    	  System.out.print(echos[i] + " ");
      }
      System.out.println();
      
      // set up request to stop the robot
      robot.setMotion(0, 0);
   }
}