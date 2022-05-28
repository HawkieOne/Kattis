import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class QALY {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float periodsOfConstanQuality = Float.parseFloat(s.nextLine());
        int i = 0;
        double periodQOF = 0;
        while(i < periodsOfConstanQuality) {
            double QOF = Float.parseFloat(s.next());
            double numberofYears = Float.parseFloat(s.next());
            periodQOF += QOF * numberofYears;
            i++;
        }
        double roundOff = (double) Math.round(periodQOF * 100) / 100;
        System.out.println(roundOff);
    }
}
