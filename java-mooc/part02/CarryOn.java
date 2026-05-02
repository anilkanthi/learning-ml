import java.util.Scanner;

public class CarryOn {
    
    public static void main(String[] main) {
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Shall we carry on?");
            String user = scanner.nextLine();
            
            if (user.equals("no")) {
                break;
            }
        }
    }
}