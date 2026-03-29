package Array;

import java.util.Arrays;

public class RotatedArray {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 9, 4, 5, 0, 1 };

        int left = 0;
        int right = arr.length - 1;

        while (left != right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
        }

        System.out.println(Arrays.toString(arr));
    }
}