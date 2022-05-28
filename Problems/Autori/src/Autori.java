import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Autori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] charLine = line.toCharArray();
        for( int i = 0; i < charLine.length; i++) {
            if(charLine[i] == '-') {
                System.out.print(charLine[i + 1]);
            }
            else if(i == 0) {
                System.out.print(charLine[i]);
            }
            /*System.out.println(line);
            Scanner sLine = new Scanner(line);
            sLine.useDelimiter(Pattern.compile("-"));
            ArrayList<String> letters = new ArrayList<>();
            while(sLine.hasNext()) {
                String word = scanner.next();
                String firstLetter = String.valueOf(word.charAt(0));
                letters.add(firstLetter);
                System.out.println(firstLetter);
            }
            for(String letter : letters) {
                System.out.print(letter);
            }*/
        }
    }
}
