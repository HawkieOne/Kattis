import java.util.Scanner;

public class EM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < cases; i++){
            String word = scanner.nextLine();
            int length = (int)Math.sqrt(word.length());
            char[][] matrix = new char[length][length];
            int count = 0;
            for(int j = 0; j < length; j++){
                for(int m = 0; m < length; m++){
                    matrix[m][j] = word.charAt(count);
                    count++;
                }
            }
            for(int j = length - 1; j >= 0; j--){
                for(int m = 0; m < length; m++){
                    System.out.print(matrix[j][m]);
                }
            }
            System.out.println();
        }
    }
}
