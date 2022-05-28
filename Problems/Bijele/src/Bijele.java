import java.util.Scanner;

public class Bijele {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int kings = Integer.parseInt(scanner.next());
            int queens = Integer.parseInt(scanner.next());
            int rooks = Integer.parseInt(scanner.next());
            int bishops = Integer.parseInt(scanner.next());
            int knights = Integer.parseInt(scanner.next());
            int pawns = Integer.parseInt(scanner.next());
            int kingsDif = 1 - kings;
            int queensDif = 1 - queens;
            int rooksDif = 2 - rooks;
            int bishopsDif = 2 - bishops;
            int knightsDif = 2 - knights;
            int pawnsDif = 8 - pawns;
            System.out.println(kingsDif + " " + queensDif + " " + rooksDif + " " + bishopsDif + " " +
                    knightsDif + " " + pawnsDif);
        }
}



