import java.util.Scanner;

public class SL {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int i = 0, sum = 0, tempHours = 0;
            int dataSets = Integer.parseInt(scanner.nextLine());
            String tempDataSet = "0";
            while(!tempDataSet.equals("-1")) {
                while(i < dataSets) {
                    int miles = Integer.parseInt(scanner.next());
                    int hours = Integer.parseInt(scanner.next()) - tempHours;
                    tempHours = hours;
                    sum += hours * miles;
                    i++;
                }
                i = 0;
                System.out.println(sum + " miles");
                tempDataSet = scanner.nextLine();
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
