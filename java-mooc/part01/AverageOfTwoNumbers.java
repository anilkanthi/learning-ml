import java.util.Scanner;

public class AverageOfTwoNumbers {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        //Averaging involves decimal numbers hence using double makes more sense
        // since first and second are integers, multiplying by 1.0 makes them floating point numbers by default
        double sum = first + second * 1.0;
        //the sum of the two integers is divided by two, to calculate the average of the two numbers.
        double average  = sum / 2;
        
        System.out.println("The average is " + average);
    }
}