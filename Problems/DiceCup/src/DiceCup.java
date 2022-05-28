import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class DiceCup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dice1 = Integer.parseInt(scanner.next());
        int dice2 = Integer.parseInt(scanner.next());
        int sum = 0;
        int[] outcomes = new int[dice1 + dice2];
        for(int i = 1; i <= dice1; i++) {
            for(int j = 1; j <= dice2; j++) {
                sum = i + j - 1;
                outcomes[sum]++;
            }
        }
        int highest = 0;
        for(int i = 0; i < outcomes.length; i++) {
            if(outcomes[i] > highest) {
                highest = outcomes[i];
            }
        }
        for(int i = 0; i < outcomes.length; i++) {
            if(outcomes[i] == highest) {
                System.out.println(i + 1);
            }
        }
    }
}
