import java.util.Scanner;

public class Cudoviste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.next());
        int columns = Integer.parseInt(scanner.next());
        char[][] matrix = new char[rows][columns];
        for(int i = 0; i < rows; i++){
            String line = scanner.next();
            for(int j = 0; j < columns; j++){
                char c = line.charAt(j);
                matrix[i][j] = c;
            }
        }
        int[] result = new int[5];
        int count = 0;
        for(int i = 0; i < rows - 1; i++){
            for(int j = 0; j < columns - 1; j++){
                char c = matrix[i][j];
                if(matrix[i][j] == 'X'){
                    count++;
                }
                if(matrix[i + 1][j] == 'X'){
                    count++;
                }
                if(matrix[i][j + 1] == 'X'){
                    count++;
                }
                if(matrix[i + 1][j + 1] == 'X'){
                    count++;
                }
                if(matrix[i][j] == '#' || matrix[i + 1][j] == '#' || matrix[i][j + 1] == '#' || matrix[i + 1][j + 1] == '#'){
                    count = 0;
                }
                else{
                    //System.out.println(count);
                    result[count]++;
                }
                count = 0;
            }
        }
        for(int j = 0; j < result.length; j++){
            System.out.println(result[j]);
        }
    }
}
