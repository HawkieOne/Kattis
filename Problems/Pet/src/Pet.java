import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = 0, mostPoints = 0, winner = 0;
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 4; j++) {
                points += Integer.parseInt(scanner.next());
            }
            if(points > mostPoints) {
                mostPoints = points;
                winner = i + 1;
            }
            points = 0;
        }
        System.out.println(winner + " " + mostPoints);
    }
}
