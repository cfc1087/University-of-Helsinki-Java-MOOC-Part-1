
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
        
        System.out.println("Type the radius: ");
        float r = reader.nextInt();
        double p = Math.PI;
        System.out.println("Circumference of the circle: " + 2*r*p );
        
    }
}
