
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        
        System.out.print("First: ");
        int low = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int hi = Integer.parseInt(reader.nextLine());
        int i =low;
        while(i<=hi){
            System.out.println(i);
            i++;
        }
        

    }
}
