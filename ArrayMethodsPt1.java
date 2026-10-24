import java.util.Arrays;
/**
 * methods for working with arrays
 * @author jacob patterson jpatterson@student.sdccd.edu
 * @version 1.0
 * @since 10/21/2026
 */
public class CopyOfArrayMethods
{
    private int[] myArray = {7, 8, 8, 3, 4, 9, 8, 7};
    /**
     * counts the number of elements in array
     * @return the number of elements
     */
    public int count() {
        int count = 0;
        for (int value : myArray) {
            count++;
        }
        return count;
    }
    /**
     * calculates the sum of all array elements
     * @return the sum of the elements
     */
    public int sum() {
        int total = 0;
        for (int value : myArray) {
            total += value;
        }
        return total;
    }
    /**
     * calculates the average of the array
     * @return the average as a double
     */
    public double average() {
        return (double) sum() / count();
    }
    /**
     * Finds the largest number in the array
     * @return the largest value
     */
    public int findMax() {
        int max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        return max;
    }
    /**
     * finds the index of the largest number
     * @return the index of the largest value
     */
    public int findIndexOfMax() {
        int maxIndex = 0;
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > myArray[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    /**
     * Prints an integer array.
     * @param inArray the array to print
     */
    public void print(int[] inArray) {
        System.out.print("{");
        int i;
        for (i = 0; i < inArray.length - 1; i++) {
            System.out.print(inArray[i] + ", ");
        }
        if (inArray.length > 0) {
            System.out.print(inArray[i]);
        }
        System.out.println("}");
    }
}
