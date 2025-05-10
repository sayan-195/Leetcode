import java.util.*;

public class Leetcode26_Array {
    public static void remove_duplicate(int arr[]) {
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }
        }
    }

    public static int remove_duplicateTwice(int arr[]) {
        int j = 0, count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[j] != arr[i]) {
                count = 0;
            } else {
                count++;
            }
            if (count <= 1) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 3, 4, 4, 4, 5, 6, 6, 6 };
        int b = remove_duplicateTwice(arr);
        System.out.println(b);
        print(arr);

    }
}
