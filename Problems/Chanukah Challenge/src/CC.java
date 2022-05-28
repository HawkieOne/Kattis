import java.util.Scanner;

public class CC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < cases; i++){
            int caseNumber = Integer.parseInt(scanner.next());
            int length = Integer.parseInt(scanner.next());
            int sum = 0;
            for(int j = 1; j <= length; j++){
                sum += j;
            }
            sum += length;
            System.out.println((i + 1) + " " + sum);
            sum = 0;
        }
    }
}
