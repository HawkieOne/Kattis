import java.util.*;

public class HeartRate {
    public static void main(String[] args) {
        TreeMap<Integer, Double> map = new TreeMap<>();
        try (Scanner scanner = new Scanner(System.in)) {
            int cases = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < cases; i++) {
                int b = Integer.parseInt(scanner.next());
                double p = Double.parseDouble(scanner.next());
                map.put(b, p);
                double ABPM = 60 / p;
                double BPM = (60 * b / p);
                double min = BPM - ABPM;
                double max = BPM + ABPM;
                min = (double) Math.round(min * 10000d) / 10000d;
                max = (double) Math.round(max * 10000d) / 10000d;
                System.out.println(min + " " + BPM + " " + max);
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
