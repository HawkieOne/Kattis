import java.util.Scanner;

public class RP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalJudges = scanner.nextInt();
        int judgesLeft = scanner.nextInt();
        int judgesDone = totalJudges - judgesLeft;
        int sum = 0;
        for (int i = 0; i < judgesLeft; i++) {
            sum += scanner.nextInt();
        }
        double min = sum;
        double max = sum;
        for (int i = 0; i < judgesDone; i++) {
            min -= 3;
            max += 3;
        }
        min = min / totalJudges;
        max = max / totalJudges;
        System.out.println(min + " " + max);
    }
}
