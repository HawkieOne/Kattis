import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int cases = Integer.parseInt(scanner.next());
            int maxSpeed = 0;
            int time = Integer.parseInt(scanner.next());
            int distance = Integer.parseInt(scanner.next());
            for (int i = 0; i < cases - 1; i++) {
                int nextTime = Integer.parseInt(scanner.next());
                int nextDistance = Integer.parseInt(scanner.next());
                int speed = (nextDistance - distance) / (nextTime - time);
                if (speed > maxSpeed) {
                    maxSpeed = speed;
                }
                time = nextTime;
                distance = nextDistance;
            }
            System.out.println(maxSpeed);
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
