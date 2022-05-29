import java.util.*;

public class SC {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int widthCake = scanner.nextInt();
            int pieces = scanner.nextInt();
            int[][] values = new int[pieces][2];
            for (int i = 0; i < pieces; i++) {
                values[i][0] = scanner.nextInt();
                values[i][1] = scanner.nextInt();
            }
            int maxW = values[0][0], maxL = values[0][1], max = 0;
            for (int i = 0; i < pieces; i++) {
                for (int j = 0; j < 2; j++) {
                    if (values[i][j] > maxW) {
                        maxW = values[i][j];
                    }
                }
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
