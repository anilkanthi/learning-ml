import java.util.Scanner;

public class AverageOfPositiveNumbers {
    
    public static void main(String[] main) {
        
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int positive_numbers = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                sum += number;
                positive_numbers += 1;
                continue;
            }
        }
        if (sum != 0) {
            System.out.println(sum / positive_numbers * 1.0);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}