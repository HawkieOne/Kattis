import java.util.ArrayList;
import java.util.Scanner;

public class PL {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int cases = Integer.parseInt(scanner.next());
            boolean state;
            ArrayList<String> list;
            for (int i = 0; i < cases; i++) {
                list = new ArrayList<>();
                state = false;
                String phoneNumbers = scanner.next();
                for (int j = 0; j < Integer.parseInt(phoneNumbers); j++) {
                    list.add(scanner.next());
                }
                for (int j = 0; j < list.size(); j++) {
                    String number = list.get(j);
                    for (int k = 0; k < list.size(); k++) {
                        if (j != k) {
                            String number2 = list.get(k);
                            if (number.startsWith(number2)) {
                                state = true;
                            }
                        }
                    }
                }
                if (state) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
