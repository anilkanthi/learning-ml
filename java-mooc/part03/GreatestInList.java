import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
            int numbers = Integer.valueOf(scanner.nextLine());
            if (numbers == -1) {
                break;
            }
            
            list.add(numbers);
        }
        
        System.out.println("");
        
        int greatest = 0;
        
        for (int i = 0; i < list.size(); i++) {
            if (greatest < list.get(i)) {
                greatest = list.get(i);
            }
        }
        
        System.out.println("The greatest number: " + greatest);
    }
}