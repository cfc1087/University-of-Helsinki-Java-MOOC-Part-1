
import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type you name: ");
        System.out.print("First Character: " + firstCharacter(reader.nextLine()));
       
    }
    
    public static char firstCharacter(String text){
        
        return text.charAt(0);
    }

    
}

