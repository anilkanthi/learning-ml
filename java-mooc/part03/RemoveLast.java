import java.util.ArrayList;

public class RemoveLast {
    
    public static void main(String[] args) {
        
        ArrayList<String> List = new ArrayList<>();
        List.add("First");
        List.add("Second");
        List.add("Third");
        
        System.out.println(List);
        
        removeLast(List);
        removeLast(List);
        
        System.out.println(List);
    }
    
    public static void removeLast(ArrayList<String> string) {
        if (string.size() == 0) {
            return;
        }
        string.remove(string.size() - 1);
    }
}