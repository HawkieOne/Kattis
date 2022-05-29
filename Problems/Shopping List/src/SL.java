import java.util.ArrayList;
import java.util.Scanner;

public class SL {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int lines = scanner.nextInt();
            int words = scanner.nextInt();
            String[][] items = new String[lines][words];
            for (int i = 0; i < lines; i++) {
                for (int j = 0; j < words; j++) {
                    items[i][j] = scanner.next();
                }
            }
            ArrayList<String> same = new ArrayList<>();
            boolean state = false;
            int count = 0;
            for (int i = 0; i < lines; i++) {
                count = 0;
                String word = items[0][i];
                state = false;
                for (int j = 1; j < lines; j++) {
                    for (int k = 0; k < words; k++) {
                        String compWord = items[j][k];
                        if (compWord.equals(word)) {
                            count++;
                            if (count == lines - 1) {
                                same.add(compWord);
                            }
                            k = words;
                        }
                    }
                }
            }
            System.out.println(same.size());
            for (int i = 0; i < same.size(); i++) {
                System.out.println(same.get(i));
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
