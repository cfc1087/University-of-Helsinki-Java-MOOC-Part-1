
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GradeBook gradebook = new GradeBook();
        Scanner scanner = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        System.out.println("Type exam scores, -1 completes:  ");
        int score = 0;
        while (true) {
            score = Integer.parseInt(scanner.nextLine());
            if (score == -1) {
                break;
            }
            if (score >= 0&&score<=60) {
                gradebook.addScore(score);
            }

        }
        gradebook.gradeDistribution();

    }
}
