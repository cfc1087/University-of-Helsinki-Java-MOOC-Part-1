
public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times      
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.println();

    }

    public static void printSquare(int sideSize) {
        // 39.2
      

            for (int col = 0; col < sideSize; col++) {
               printStars(sideSize);
            }
            System.out.println();
       

    }

    public static void printRectangle(int width, int height) {
        // 39.3
        
            for (int col = 0; col < height; col++) {
                  printStars(width);
            }
            System.out.println();
        
    }

    public static void printTriangle(int size) {
        // 39.4
       // for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                  printStars(col);
            }
            System.out.println();
        //}
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(5);
       printStars(3);
        printStars(9);
        System.out.println();
        printSquare(4);
        System.out.println();
        printRectangle(17, 3);
        System.out.println();
        printTriangle(3);

    }

}
