
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            
            String[] lines = input.split(" ");
            for (String i: lines) {
                System.out.println(i);
            }
            
            if (input.equals("")) {
                break;
            }
        }        
        
    }
}
