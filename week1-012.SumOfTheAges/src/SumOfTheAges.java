
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.print("Type your name: ");
        String user1 = reader.nextLine();
        System.out.print("Type your age: ");
        int age1  = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type your name: ");
        String user2 = reader.nextLine();
        System.out.print("Type your age: ");
        int age2  = Integer.parseInt(reader.nextLine());
        int total = age1+age2;
        System.out.printf("%s and %s are %d years old in total.",user1, user2, total);        
        
        
      
    }
}
