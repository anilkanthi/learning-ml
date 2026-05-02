import java.util.Scanner;

public class SquareRootOfSum {
    
    public static void main(String[] main) {
        
        Scanner scanner = new Scanner(System.in);
        
        int number1 = Integer.valueOf(scanner.nextLine());
        int number2 = Integer.valueOf(scanner.nextLine());
        int sum = number1 + number2;
        
        double square_root = Math.sqrt(sum);
        
        System.out.println(square_root);
    }
}