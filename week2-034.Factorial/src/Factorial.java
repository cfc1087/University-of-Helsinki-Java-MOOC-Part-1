import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int n= Integer.parseInt(reader.nextLine());
        
        for(int i = n-1;i>0;i--){
            n*=i; 
        }
        System.out.print("Factorial is "+n);
        

    }
}
