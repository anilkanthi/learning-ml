import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> List = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            List.add(input);
        }
        System.out.println("");
        
        System.out.println("Search for? ");
        String query = scanner.nextLine();
        
        if (List.contains(query)) {
            System.out.println(query + " was found!");
        } else {
            System.out.println(query + " was not found!");
        }
    }
}