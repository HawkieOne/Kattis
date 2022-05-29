import java.util.Scanner;

public class SM {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int cases = scanner.nextInt();
            for (int i = 0; i < cases; i++) {
                StringBuilder word = new StringBuilder(scanner.next());
                int L = word.length();
                double M = -1;
                for (int j = 1; j <= L / 2 + 1; j++) {
                    double square = Math.pow(j, 2);
                    if (square > M) {
                        M = square;
                        if (M >= L) {
                            break;
                        }
                    }
                }
                int ML = (int) M - L;
                word.append("*".repeat(Math.max(0, ML)));

                double root = Math.sqrt(M);
                int count = 0;
                char[][] matrice = new char[(int) root][(int) root];
                for (int j = 0; j < root; j++) {
                    for (int k = 0; k < root; k++) {
                        matrice[j][k] = word.charAt(count);
                        count++;
                    }
                }
                char[][] matrice2 = new char[(int) root][(int) root];
                for (int j = (int) root - 1; j >= 0; j--) {
                    for (int k = 0; k < root; k++) {
                        matrice2[k][j] = matrice[((int) root - 1) - j][k];
                    }
                }

                for (int j = 0; j < root; j++) {
                    for (int k = 0; k < root; k++) {
                        char newLetter = matrice2[j][k];
                        if (newLetter != '*') {
                            System.out.print(newLetter);
                        }
                    }
                }
                System.out.println();
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
