
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        while (true) {
            System.out.print("Type the password: ");
            String pw = reader.nextLine();
            if (pw.equals(password) == false) {
                System.out.print("Wrong!");
            } else {
                System.out.println("Right!");
                System.out.print("The secret is: jryy qbar");
                break;
            }

        }
    }
}