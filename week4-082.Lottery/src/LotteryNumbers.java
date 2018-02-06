
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        //this.numbers.ensureCapacity(7);
        // Write the number drawing here using the method containsNumber()
        Random random = new Random();
        int number = random.nextInt(39 - 1 + 1) + 1;
        for (int i = 0; i < 7; i++) {
            if (!containsNumber(number)) {
                this.numbers.add(number);
            } else if (containsNumber(number)) {
                do {
                    number = random.nextInt(39 - 1 + 1) + 1;
                } while (containsNumber(number));
                this.numbers.add(i, number);

            }
            number = random.nextInt(39 - 1 + 1) + 1;
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (this.numbers.contains(number)) {
            return true;
        } else {
            return false;
        }
    }
}
