import java.util.Scanner;

public class LTU {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int people = Integer.parseInt(scanner.nextLine());
            String name = scanner.nextLine();
            int state = 0, change = 0;
            for (int i = 0; i < people - 1; i++) {
                String name2 = scanner.nextLine();
                for (int j = 0; j < name.length(); j++) {
                    if (name.charAt(j) < name2.charAt(j)) {
                        char c = name.charAt(j);
                        if (state == 2) {
                            change = 1;
                            j = name.length();
                            i = people - 1;
                        }
                        state = 1;
                        j = name.length() - 1;
                    } else if (name.charAt(j) > name2.charAt(j)) {
                        if (state == 1) {
                            change = 1;
                            j = name.length();
                            i = people - 1;
                        }
                        state = 2;
                        j = name.length() - 1;
                    }
                }
                name = name2;
            }
            if (change == 1) {
                System.out.println("NEITHER");
            } else if (state == 1) {
                System.out.println("INCREASING\n");
            } else if (state == 2) {
                System.out.println("DECREASING\n");
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
