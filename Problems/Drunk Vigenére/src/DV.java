import java.util.Scanner;

public class DV {

    public static final int NUM = 31;

    // Function to calculate the position
    // of characters
    static void positions(String str, int n)
    {
        for (int i = 0; i < n; i++) {

            // Performing AND operation
            // with number 31
            System.out.print((str.charAt(i) & NUM) + " ");
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String key = scanner.nextLine();
        String newWord = "";
        int number = 0;
        for(int i = 0;i < word.length(); i++){
            int posWord = (word.charAt(i) & NUM) - 1;
            //System.out.println(posWord);
            int posKey = (key.charAt(i) & NUM) - 1;
            //System.out.println(posKey);
            if(i % 2 == 0){
                number = posWord + posKey;
                System.out.println(number);
                //System.out.println("EVEN: " +  posWord);
                //System.out.println("EVEN: " +  posKey);
            }
            else{
                number = posWord - posKey;
                System.out.println(number);
                //System.out.println("ODD: " + posWord);
                //System.out.println("EVEN: " +  posKey);
            }
            if(number > )
            //System.out.println();
        }
    }
}