
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = -1;
        String name = "name";
        
        while (true) {
            String input  = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] line = input.split(",");
            
            int age = Integer.valueOf(line[1]);
            
            if (age > oldest) {
                oldest = age;
                name = line[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
