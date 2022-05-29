import java.util.ArrayList;
import java.util.Scanner;

public class BP {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int parts = scanner.nextInt();
            int days = scanner.nextInt();
            ArrayList<String> installedParts = new ArrayList<>();
            for (int i = 0; i < days; i++) {
                String partToday = scanner.next();
                if (!installedParts.contains(partToday)) {
                    installedParts.add(partToday);
                }
                if (installedParts.size() == parts) {
                    System.out.println(i + 1);
                    break;
                }
                else if (i == days - 1) {
                    System.out.println("paradox avoided");
                    break;
                }
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
