import java.util.Scanner;

public class Factorial {
    
    public static void main (String[] main) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        
        int factorial = 1;
        
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial: " + factorial);
    }
}