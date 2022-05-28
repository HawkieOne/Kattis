import java.util.Scanner;

public class Rijeci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersPressed = Integer.parseInt(scanner.nextLine());
        StringBuilder word = new StringBuilder("A");
        for(int i = 0; i < numbersPressed; i++){
            for(int j = 0; j < word.length(); j++){
                if(word.charAt(j) == 'A'){
                    word.setCharAt(j, 'B');
                }
                else if(word.charAt(j) == 'B'){
                    word.insert(j + 1, 'A');
                    j++;
                }
            }
            System.out.println(word);
        }
        int countA = 0, countB = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'A'){
                countA++;
            }
            else if(word.charAt(i) == 'B'){
                countB++;
            }
        }
        System.out.println(countA + " " + countB);
    }
}
