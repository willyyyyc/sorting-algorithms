import java.util.Scanner;
public class BubbleSort {
    /* 
     * method to sort array using "bubble sort": 
     * start at index 0 and compare to next element
     * if index 0 is bigger than swap the elements
     * move onto next pair
     * repeat for each element in array or until sorted
    */
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j +1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
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
