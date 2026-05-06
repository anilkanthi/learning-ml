import java.util.Scanner;

public class LastWords {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] LINE = input.split(" ");
            System.out.println(LINE[LINE.length - 1]);
        }
    }
}