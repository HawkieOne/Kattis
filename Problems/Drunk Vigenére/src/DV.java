import java.util.Scanner;

public class DV {

    public static final int NUM = 31;

    static void positions(String str, int n) {
        for (int i = 0; i < n; i++) {
            // Performing AND operation
            // with number 31
            System.out.print((str.charAt(i) & NUM) + " ");
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in)) {
            String word = scanner.nextLine();
            String key = scanner.nextLine();
            String newWord = "";
            int number = 0;
            for(int i = 0;i < word.length(); i++){
                int posWord = (word.charAt(i) & NUM) - 1;
                int posKey = (key.charAt(i) & NUM) - 1;
                if(i % 2 == 0){
                    number = posWord + posKey;
                    System.out.println(number);
                }
                else{
                    number = posWord - posKey;
                    System.out.println(number);
                }
                if(number > )
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}