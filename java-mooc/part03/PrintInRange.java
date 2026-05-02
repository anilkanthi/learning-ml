import java.util.ArrayList;

public class PrintInRange {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> List = new ArrayList<>();
        List.add(3);
        List.add(2);
        List.add(6);
        List.add(-1);
        List.add(5);
        List.add(1);
        
        System.out.println("Numbers in between the range [0-5]: ");
        printNumbersInRange(List, 0, 5);
        
        System.out.println("Numbers in between the range [5-10]: ");
        printNumbersInRange(List, 3, 10);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> List, int lowerLimit, int upperLimit) {
        for (int number: List) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    } 
}