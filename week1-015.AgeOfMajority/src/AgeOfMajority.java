
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here 
        
        System.out.print("How old are you?");
        int age = Integer.parseInt(reader.nextLine());
        if(age<18){
            System.out.print("You have not reached the age of majority yet!");
        }else if(age>=18){
            System.out.print("You have reached the age of majority!");
        }
        
        
    }
}
