/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christopher
 */
public class Product {

    private double Price;
    private int Amount;
    private String Name;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
            this.Name = nameAtStart;
            this.Price = priceAtStart;
            this.Amount = amountAtStart;
    }

    public void printProduct() {
        System.out.printf("%s, %.2f, %d",Name, Price, Amount);
    }
}
