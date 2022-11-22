import java.util.Scanner;
public class InsertionSort {
    /* 
     * sort method 
    */
    public static int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int curr = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > curr) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = curr;
        }
        return array;
    }
    
    /* main method: */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // creating array of int of size n:
        int n = in.nextInt();
        int[] arrayToBeSorted = new int[n];

        for (int i = 0; i < n; i++) {
            arrayToBeSorted[i] = in.nextInt();
        }

        // calling sort method to sort array:
        sort(arrayToBeSorted);

        // print sorted array:
        for (int num : arrayToBeSorted) {
            System.out.print(num + " ");
        }

        in.close();
    }
}