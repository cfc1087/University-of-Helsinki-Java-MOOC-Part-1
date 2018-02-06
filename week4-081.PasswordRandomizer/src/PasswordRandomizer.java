
import java.util.Random;

public class PasswordRandomizer {

    // Define the variables
    private Random random;
    private String pw;
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.random = new Random();
        this.pw = "";
        this.length = length;

    }

    public String createPassword() {
        this.pw = "";
        for (int i = 0; i < this.length ; i++) {
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(this.random.nextInt(26));
            this.pw += symbol;
        }
        return this.pw;
    }
}
