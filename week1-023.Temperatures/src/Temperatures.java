
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while (true) {
            System.out.print("Input a floating point number: ");
            double number = Double.parseDouble(reader.nextLine());

            if (number > -30.0 && number < 40.0) {
                Graph.addNumber(number);

            }
        }
    }
}
