import java.util.Scanner;

public class AVClub {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            
            String[] text = input.split(" ");
            
            for (String i: text) {
                if (i.contains("av")) {
                    System.out.println(i);
                }
            }
            
            if (input.equals("")) {
                break;
            }
        }
    }
}