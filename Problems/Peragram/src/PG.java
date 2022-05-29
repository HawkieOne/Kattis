import java.util.Scanner;

public class PG {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String word = scanner.next();
            boolean peragram = false;
            StringBuilder sb = new StringBuilder(word);
            while (!peragram) {

            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
