
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        System.out.println("Type numbers: ");
        int num = 0;
       while(true){
            num = Integer.parseInt(reader.nextLine());
            if(num==-1)
                break;
            if (num % 2 == 0) {
                stats.addNumber(num);
                even.addNumber(num);
            } else if (num % 2 != 0) {
                stats.addNumber(num);
                odd.addNumber(num);
            } else {
                break;
            }

        } 
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());

    }
}
