import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> List = new ArrayList<>();
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1) {
                break;
            }
            
            List.add(number);
        }
        
        System.out.println("");
        
        System.out.println("Search for? ");
        int query = Integer.valueOf(scanner.nextLine());
        
        for (int i = 0; i < List.size(); i++) {
            if (query == List.get(i)) {
                System.out.println(query + " is at index " + i);
            }
        }
    }
}