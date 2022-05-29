import java.util.Scanner;

public class Skener {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int rows = Integer.parseInt(scanner.next());
            int columns = Integer.parseInt(scanner.next());
            int rowsMultiply = Integer.parseInt(scanner.next());
            int columnsMultiply = Integer.parseInt(scanner.next());
            char[][] matrix = new char[rows][columns];
            for (int i = 0; i < rows; i++) {
                String line = scanner.next();
                for (int j = 0; j < columns; j++) {
                    char character = line.charAt(j);
                    matrix[i][j] = character;
                }
            }
            for (int i = 0; i < rows; i++) {
                for (int m = 0; m < rowsMultiply; m++) {
                    for (int j = 0; j < columns; j++) {
                        for (int k = 0; k < columnsMultiply; k++) {
                            System.out.print(matrix[i][j]);
                        }
                    }
                    System.out.println();
                }
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
