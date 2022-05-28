import java.util.Scanner;

public class TP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        int stops = scanner.nextInt();
        int passengers = 0;
        boolean state = true;
        int waitFinish = 0;
        for (int i = 0; i < stops; i++) {
            int walkPassengers = scanner.nextInt();
            int newPassengers = scanner.nextInt();
            int waitPassengers = scanner.nextInt();
            if (walkPassengers > passengers) {
                state = false;
            }
            passengers += newPassengers;
            passengers -= walkPassengers;
            if (passengers < 0 || passengers > capacity || passengers < capacity && waitPassengers > 0) {
                state = false;
            }
            waitFinish = waitPassengers;
        }
        if (passengers != 0 || waitFinish > 0) {
            state = false;
        }

        if(state) {
            System.out.println("possible");
        } else {
            System.out.println("impossible");
        }
    }
}
