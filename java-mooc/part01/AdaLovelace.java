import java.util.Scanner;

public class AdaLovelace {
    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many parts of Helsinki MOOC have you completed?");
        Double parts = Double.valueOf(scanner.nextLine());
        
        System.out.println("Your progress: " + (parts / 14) * 100);
        
        
    }
}


