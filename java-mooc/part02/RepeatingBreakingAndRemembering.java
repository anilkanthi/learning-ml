import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    
    public static void main (String[] main) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        
        int sum = 0;
        int totalNumbers = 0;
        int even =  0;
        int odd = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number != -1) {
                sum += number;
                totalNumbers += 1;
                
                if (number %2 == 0) {
                    even += 1;
                } else {
                    odd += 1;
                }  
                continue;
            } else {
                break;
            }
        }
        
        double average = 1.0 * sum / totalNumbers;
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + totalNumbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}