
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int low = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int hi = Integer.parseInt(reader.nextLine());
        int sum = 0;
        for(int i =low;i<=hi;i++){
            sum=sum+i;
        }
        System.out.print("The sum is "+sum);
    }
}
