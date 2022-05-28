import java.util.Scanner;

public class TT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String word = "";
        int wordLength = string.length() / 3;
        for(int i = 0; i < wordLength; i++){
            word.charAt(i) = string.charAt(i);
        }
        System.out.println(word);
    }
}
