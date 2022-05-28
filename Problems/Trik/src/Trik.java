import java.util.Scanner;
    public class Trik {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String moves = scanner.nextLine();
            int ballPos = 1;
            for(int i = 0; i < moves.length(); i++) {
                if(moves.charAt(i) == 'A' && ballPos == 1) {
                    ballPos = 2;
                }
                else if(moves.charAt(i) == 'A' && ballPos == 2) {
                    ballPos = 1;
                }
                else if(moves.charAt(i) == 'B' && ballPos == 2) {
                    ballPos = 3;
                }
                else if(moves.charAt(i) == 'B' && ballPos == 3) {
                    ballPos = 2;
                }
                else if (moves.charAt(i) == 'C' && ballPos == 1) {
                    ballPos = 3;
                }
                else if (moves.charAt(i) == 'C' && ballPos == 3) {
                    ballPos = 1;
                }
            }
            System.out.println(ballPos);
        }
    }
