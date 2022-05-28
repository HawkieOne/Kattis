import java.util.ArrayList;
import java.util.Scanner;

public class Karte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int length = line.length();
        int P = 13, K = 13, H = 13, T = 13;
        boolean state = false;
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 0; i < length - 2; i = i + 3){
            String word = "";
            char type = line.charAt(i);
            if(type == 'P'){
                P--;
            }
            else if (type == 'K'){
                K--;
            }
            else if (type == 'H'){
                H--;
            }
            else if (type == 'T'){
                T--;
            }
            word = word + String.valueOf(type) + line.charAt(i + 1) + line.charAt(i + 2);
            if(!arrayList.contains(word)){
                arrayList.add(word);
            }
            else{
                System.out.println("GRESKA");
                i = length;
                state = true;
            }
        }
        if(!state){
            System.out.println(P + " " + K + " " + H + " " + T);
        }
    }
}
