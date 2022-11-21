/*
 * Author: William Carmichael
 * Description: This program explores a method of sorting through
 * arrays using an algorithm called "selection sort". I did come
 * up with this algorithm, but found it on https://www.geeksforgeeks.org/selection-sort/
 * and am implementing it for the first time.
 * Date: 2022-11-21
 */

import java.util.Scanner;
public class SelectionSort {
    /* 
     * method to sort array using "selection sort": 
     * start at index 0, traverse array to find min
     * value then swap with first value. Move to second
     * value and repeat.
    */
    public static int[] sort(int[] array) {
        // loop through array
        for (int i = 0; i < array.length; i++) {
            int valueToSwap = i;
            // loop through array from i to end, find smalles value
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[valueToSwap]) {
                    valueToSwap = j;
                }
            }
            // swap smallest value with i
            int temp = array[i];
            array[i] = array[valueToSwap];
            array[valueToSwap] = temp;
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // create array integers of size n
        int n = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        // call method to sort array
        sort(array);

        // print array
        for (int num : array) {
            System.out.print(num + " ");
        }

        in.close();
    }
}