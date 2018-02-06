
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
         System.out.println(Arrays.toString(values));
        sort(values);

    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int item : array) {
            if (item < smallest) {
                smallest = item;
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        // code goes here
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest(array)) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // write the code here
        int smallestIndex = 0;
        int smallest = array[index];
        for (int i = index; i < array.length; i++) {
            if (array[i] <= smallest) {
                smallestIndex = i;
                smallest = array[i];
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        // code goes here
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

    public static void sort(int[] array) {
        int temp = 0;
        int index = 0;
      
        for (int i = 0; i < array.length; i++) {
            temp = indexOfTheSmallestStartingFrom(array, i);
           
            swap(array, temp, i);
            System.out.println(Arrays.toString(array));

        }

    }

}
