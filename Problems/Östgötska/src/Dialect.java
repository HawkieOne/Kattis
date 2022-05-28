import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Dialect {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String line = br.readLine();
            String[] words = line.split(" ");
            double wordsAE = 0;
            for (String word : words) {
                if (word.contains("ae")) {
                    wordsAE++;
                }
            }
            if(wordsAE / words.length < 0.4) {
                System.out.println("haer talar vi rikssvenska");
            } else {
                System.out.println("dae ae ju traeligt va");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
