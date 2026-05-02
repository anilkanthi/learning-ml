import java.util.Scanner;

public class NumberAndSumOfNumbers {
    
    public static void main (String[] main) {
        
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int total_numbers = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number != 0) {
                sum += number;
                total_numbers += 1;
                continue;
            }
        }
        System.out.println("Number of numbers: " + total_numbers);
        System.out.println("Sum of the numbers: " + sum);
    }
}