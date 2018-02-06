
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner reader = new Scanner(System.in);
        String name = "";
        String latin = "";
        Birds birds = new Birds();

        do {
            System.out.print("?");
            String s = reader.nextLine();
            if (s.equals("Add")) {
                System.out.print("Name: ");
                name = reader.nextLine();
                System.out.print("Latin Name: ");
                latin = reader.nextLine();

                birds.add(name, latin);

            }
            if (s.equals("Observation")) {
                System.out.print("What was oberved:? ");
                name = reader.nextLine();
                birds.Oberservation(name);

            }
            if (s.equals("Statistics")) {

                birds.statistics();
            }
            if (s.equals("Show")) {
                System.out.print("What? ");
                name = reader.nextLine();
                birds.Show(name);
            }
            if (s.equals("Quit")) {
                break;
            }

        } while (true);

    }

}
