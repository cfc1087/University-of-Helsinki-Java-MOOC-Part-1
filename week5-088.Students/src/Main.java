
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        String name;
        String number;
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.print("name: ");
            name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("studentnumber:");
            number = reader.nextLine();
            Student s = new Student(name, number);
            list.add(s);

        }
        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("Give search term: ");
        String term = reader.nextLine();
        System.out.println("Result: ");
        for(Student student:list){
            if(student.getName().contains(term)){
                System.out.println(student);
            }
        }
    }

}
