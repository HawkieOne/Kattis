import java.util.Locale;
import java.util.Scanner;

public class ANA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String orgWord = scanner.nextLine().toLowerCase(Locale.ROOT);
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < orgWord.length(); i++) {
            switch (orgWord.charAt(i)) {
                case 'a':
                case 'A':
                    word.append('@');
                break;
                case 'b':
                case 'B':
                    word.append('8');
                break;
                case 'c':
                case 'C':
                    word.append('(');
                break;
                case 'd':
                case 'D':
                    word.append("|)");
                break;
                case 'e':
                case 'E':
                    word.append('3');
                break;
                case 'f':
                case 'F':
                    word.append('#');
                break;
                case 'g':
                case 'G':
                    word.append('6');
                break;
                case 'h':
                case 'H':
                    word.append("[-]");
                break;
                case 'i':
                case 'I':
                    word.append('|');
                break;
                case 'j':
                case 'J':
                    word.append("_|");
                break;
                case 'k':
                case 'K':
                    word.append("|<");
                break;
                case 'l':
                case 'L':
                    word.append('1');
                break;
                case 'm':
                case 'M':
                    word.append("[]\\/[]");
                break;
                case 'n':
                case 'N':
                    word.append("[]\\[]");
                break;
                case 'o':
                case 'O':
                    word.append('0');
                break;
                case 'p':
                case 'P':
                    word.append("|D");
                break;
                case 'q':
                case 'Q':

                    word.append("(,)");
                break;
                case 'r':
                case 'R':
                    word.append("|Z");
                break;
                case 's':
                case 'S':
                    word.append('$');
                break;
                case 't':
                case 'T':
                    word.append("']['");
                break;
                case 'u':
                case 'U':
                    word.append("|_|");
                break;
                case 'v':
                case 'V':
                    word.append("/\\/");
                break;
                case 'w':
                case 'W':
                    word.append("\\/\\/");
                break;
                case 'x':
                case 'X':
                    word.append("}{");
                break;
                case 'y':
                case 'Y':
                    word.append("`/");
                break;
                case 'z':
                case 'Z':
                    word.append('2');
                break;
                default:
                    word.append(orgWord.charAt(i));
                    break;
            }
        }
        System.out.println(word);
    }
}
