
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Christopher
 */
public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;

    }

    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {

        Random random = new Random();

        for (int i = 0; i < this.width; i++) {
            double density = random.nextDouble();
            if (this.density < density) {
                System.out.print(" ");
            } else {
                this.starsInLastPrint++;
                System.out.print("*");
            }
        }
    }

    public void print() {
        this.starsInLastPrint = 0;
        for (int j = 0; j < this.height; j++) {
            printLine();
            System.out.println();
        }

    }

    public int starsInLastPrint() {

        return this.starsInLastPrint;
    }

}
