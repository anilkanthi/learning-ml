import java.util.Scanner;

public class AgeOfTheOldest {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] line = input.split(",");
            
            String ageString =  line[1];
            int ageNumber = Integer.valueOf(ageString);
            
            if (ageNumber > oldest) {
                oldest = ageNumber;
            }   
        }
        
        System.out.println("Age of the oldest: " + oldest);
    }
}