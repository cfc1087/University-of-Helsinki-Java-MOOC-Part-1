
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable

        // Write your program here
        System.out.print("Type the first number: ");
        read = Integer.parseInt(reader.nextLine());
        System.out.print("Type the second number: ");
        sum = sum + read;
        read = Integer.parseInt(reader.nextLine());
        System.out.print("Type the third number: ");
        sum=sum+read;
        read = Integer.parseInt(reader.nextLine());
        sum = sum+read;
        
        // Use only variables sum and read

        System.out.println("Sum: " + sum);
    }
}
