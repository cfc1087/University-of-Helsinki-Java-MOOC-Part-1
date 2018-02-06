
import java.util.Calendar;

public class Person {

    private String name;
    private MyDate birthday;

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Person(String name) {

        int day = Calendar.getInstance().get(Calendar.DATE);
        int month = Calendar.getInstance().get(Calendar.MONTH )+1; // January is 0 so we add one
        int year = Calendar.getInstance().get(Calendar.YEAR);
        this.name = name;
        this.birthday = new MyDate(day, month, year);
    }

    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 

        int day = Calendar.getInstance().get(Calendar.DATE);
        int month = Calendar.getInstance().get(Calendar.MONTH )+1; // January is 0 so we add one
        int year = Calendar.getInstance().get(Calendar.YEAR);
        MyDate today = new MyDate(day, month, year);
        int age = birthday.differneceInYears(today);
        return age;
    }

    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        int thisAge = this.age();
        int compAge = compared.age();
        if (thisAge == compAge) {
            if (this.birthday.earlier(compared.birthday)) {
                return true;
            }
        } else if (thisAge > compAge) {
            return true;
        }

        return false;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }

}