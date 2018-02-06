/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christopher
 */
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next() {
        // write code here
        if (this.value == this.upperLimit) {
            this.value = 0;
            return;
        }
        this.value++;

    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if (value >= 0 && value <= this.upperLimit) {
            this.value = value;
        }

    }

    @Override
    public String toString() {
        // write code here
        String s = "";
        if (this.value < 10) {
            s = String.format("%02d", this.value);

        } else if (this.value >= 10) {
            s = String.format("%d", this.value);

        }
        return s;
    }

}
