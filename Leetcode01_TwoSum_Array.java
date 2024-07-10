import java.util.*;
public class Leetcode01_Array{

    public static int[] twoSum(int arr[],int target){
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    int a[]={i,j};
                    return a;
                }
            }
        }
        return null;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr []={3,2,4};
        System.out.println("Enter Target : ");
        int target = sc.nextInt();
        int b[]= twoSum(arr, target);
        for(int i =0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        


    }
}