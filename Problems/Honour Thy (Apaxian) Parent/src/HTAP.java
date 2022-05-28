import java.util.Scanner;

public class HTAP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String child = scanner.next();
        String parent = scanner.next();
        String newName = "";
        StringBuilder childBuilder = new StringBuilder(child);
        if(child.endsWith("e") || child.endsWith("a") || child.endsWith("i") || child.endsWith("o") || child.endsWith("u")){
            childBuilder.deleteCharAt(child.length() - 1);
            childBuilder.append('e');
            childBuilder.append('x');
            newName = childBuilder.toString() + parent;
        }
        else if(child.endsWith("ex")){
            newName = child + parent;
        }
        else{
            newName = child + "ex" + parent;
        }
        System.out.println(newName);
    }
}
