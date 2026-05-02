import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {
    
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
        int count = 0;
        
        for (int numbers: List) {
            sum += numbers;
            count += 1;
        }
        
        System.out.println("Average: " + 1.0 * sum / count);
    }
}