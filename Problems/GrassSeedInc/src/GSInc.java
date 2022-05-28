import java.util.Scanner;

public class GSInc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double costPerSquareMeter = Double.parseDouble(scanner.nextLine());
        double nrOfLawns = Double.parseDouble(scanner.nextLine());
        int i = 0;
        double width = 0, length = 0, sum = 0, area = 0;
        while( i < nrOfLawns) {
            width = Double.parseDouble(scanner.next());
            length = Double.parseDouble(scanner.next());
            area = width * length;
            sum += area * costPerSquareMeter;
            i++;
        }
        sum = (double)Math.round(sum * 100000000d) / 100000000d;
        System.out.println(sum);
    }
}
