
public class Main {

    public static void main(String[] args) {
        Money r1 = new Money(10, 0);
        Money r2 = new Money(7, 40);
        Money r3 = r1.minus(r2);
        System.out.println(r1);  // 10.00e
        System.out.println(r2);  // 3.50e
        System.out.println(r3.cents());  // 0.00e
    }
}
