
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here
        System.out.print("Type a number:");
        int num = Integer.parseInt(reader.nextLine());
        if (num % 2 == 0) {
            System.out.print("Number " + num + " is even.");
        } else if (num % 2 != 0) {
            System.out.print("Number " + num + " is odd.");
        }
    }
}
