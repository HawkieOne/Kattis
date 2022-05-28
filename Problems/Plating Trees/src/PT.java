import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountOfTrees = scanner.nextInt();
        ArrayList<Integer> trees = new ArrayList<>();

        for(int i = 0; i < amountOfTrees; i++) {
            trees.add(scanner.nextInt());
        }
        Collections.sort(trees, Collections.reverseOrder());
        int min = 0;
        int size = trees.size();
        for (int i = 0; i < size; i++) {
            if (min <= trees.get(0) + i) {
                min = trees.get(0) + i;
            }
            trees.remove(0);
        }
        System.out.println(min + 2);
    }
}
