import java.util.Scanner;

public class BB {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numbers = Integer.parseInt(scanner.nextLine());
            boolean state = false;
            String number = scanner.next();
            int numberInt = number.matches("-?\\d+(\\.\\d+)?") ? Integer.parseInt(number) : 1;
            for (int i = numberInt; i < numberInt + numbers; i++) {
                if (number.equals("mumble")) {

                } else if (!number.equals(String.valueOf(i))) {
                    System.out.println("somethings is fishy");
                    state = true;
                    return;
                }
                if (i != numberInt + numbers - 1) {
                    number = scanner.next();
                }
            }
            if (!state) {
                System.out.println("makes sense");
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
