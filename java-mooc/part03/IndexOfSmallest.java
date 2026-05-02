import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> List = new ArrayList<>();
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 9999) {
                break;
            }
            
            List.add(number);
        }
        
        int smallest = List.get(0);
        
        for (int i = 0; i < List.size(); i++) {
            int current_number = List.get(i);
            
            if (current_number < smallest) {
                smallest = current_number;
            }
        }
        System.out.println("Smallest number: " + smallest);
        
        for (int j = 0; j < List.size(); j++) {
            if (smallest == List.get(j)) {
                System.out.println("Found at index: " + j);
            }
        }
    }
}