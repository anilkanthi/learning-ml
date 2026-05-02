import java.util.Scanner;

public class AdditionFormula {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        // int sum is calculating the addition and the value of sum is given to the print statement along with first and second numbers
        int sum = first + second;
        System.out.println(first + " + " + second + " = " + sum);
    }
}