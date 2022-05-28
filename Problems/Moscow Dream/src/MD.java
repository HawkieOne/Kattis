import java.util.Scanner;

public class MD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int easyProblem = scanner.nextInt();
        int mediumProblem = scanner.nextInt();
        int hardProblem = scanner.nextInt();
        int n = scanner.nextInt();
        if (easyProblem == 0 || mediumProblem == 0 || hardProblem == 0) {
            System.out.println("NO");
        } else if((easyProblem + mediumProblem + hardProblem) < n) {
            System.out.println("NO");
        } else if(n <= 3) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
