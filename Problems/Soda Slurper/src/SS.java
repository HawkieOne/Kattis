import java.util.Scanner;

public class SS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bottlesOwned = Integer.parseInt(scanner.nextLine());
        int bottlesFound = Integer.parseInt(scanner.nextLine());
        int cost = Integer.parseInt(scanner.nextLine());
        bottlesOwned += bottlesFound;
        int bottlesBought = 0;
        while(bottlesOwned >= cost){

        }
    }

    public int recursion(int bottles, int cost){
        int bottlesBought = 0;
        while(bottles >= cost){
            bottles -= cost;
            bottlesBought++;
        }
        bottles += bottlesBought;
        return bottles;
    }
}
