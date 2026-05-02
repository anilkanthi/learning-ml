
public class AdvancedAstrology {
    
    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printTriangle(5);
        System.out.println("~~~~~~~~~");
        christmasTree(4);
        System.out.println("~~~~~~~~~");
        christmasTree(10);
        System.out.println("~~~~~~~~~");
        christmasTree(20);
    }

    public static void printStars(int number) {
        int column = 1;
        while (column <= number) {
            System.out.print("*");
            column++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int times = 1;
        while (times <= number) {
            System.out.print(" ");
            times++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int times = 1;
        while (size >= times) {
            printSpaces(size - times);
            printStars(times);
            times++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for (int times = 1; height >= times; times++) {
            printSpaces(height - times);
            
            if (times > 1) {
                printStars(times + (times - 1));
            } else {
                printStars(times);
            }      
        }
        
        int i = 2;
        while (i == 2) {
            printSpaces(height - i);
            printStars(i + (i-1));
            printSpaces(height - i);
            printStars(i + (i-1));
            i = 3;
        }
    }
}
