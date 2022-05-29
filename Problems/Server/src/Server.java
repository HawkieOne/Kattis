import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int tasks = scanner.nextInt();
            int time = scanner.nextInt();
            int completedTasks = 0;
            for (int i = 0; i < tasks; i++) {
                int nextTask = scanner.nextInt();
                if (time - nextTask >= 0) {
                    time -= nextTask;
                    completedTasks++;
                } else {
                    break;
                }
            }
            System.out.println(completedTasks);
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
