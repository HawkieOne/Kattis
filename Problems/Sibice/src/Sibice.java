import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String line = scanner.nextLine();
            String[] words = line.split(" ");
            int matches = Integer.parseInt(words[0]), W = Integer.parseInt(words[1]), H = Integer.parseInt(words[2]);
            double length = Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2));
            int i = 0;
            while( i < matches) {
                int matchLength = Integer.parseInt(scanner.nextLine());
                if(matchLength <= length) {
                    System.out.println("DA");
                }
                else {
                    System.out.println("NE");
                }
                i++;
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
