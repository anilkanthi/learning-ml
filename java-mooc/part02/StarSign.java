public class StarSign {
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        
        printSquare(4);
        
        printRectangle(17, 3);
        
        printTriangle(4);
    }
    
    public static void printStars(int number) {
        int column = 1;
        while (column <= number) {
            System.out.print("*");
            column++;
        }
        System.out.println("");
    }
    
    public static void printSquare(int size) {
        int row = 1;
        while (row <= size) {
            printStars(size);
            row++;
        }
    }

    public static void printRectangle(int width, int height) {
        int row = 1;
        while (row <= height) {
            printStars(width);
            row++;
        }
    }
    
    public static void printTriangle(int size) {
        int row = 1;
        while (size >= row) {
            printStars(row);
            row++;
        }
    }
}