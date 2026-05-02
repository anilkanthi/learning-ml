import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {
    
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
        
        int sum = 0;
        
        for (int numbers: List) {
            sum += numbers;
        }
        
        System.out.println("Sum: " + sum);                
    }
}