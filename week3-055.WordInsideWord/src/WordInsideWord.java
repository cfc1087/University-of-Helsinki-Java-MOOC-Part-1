
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first word: ");
        String word = reader.nextLine();
        System.out.println("Type the second word: ");
        String sec = reader.nextLine();
        int index = word.indexOf(sec);

        if (index != -1) {
            System.out.println("The word '" + sec + "' " + "is found in the word '" + word + "'");
        }
        else
            System.out.println("The word '" + sec + "' " + "is not found in the word '" + word + "'");

    }
}
