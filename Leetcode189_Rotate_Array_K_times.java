public class Leetcode189_Rotate_Array_K_times {
    //REVERSE AN ARRAY K TIMES 

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        reverseArray(nums, 0, n-1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, n-1);

        
    }

    public static void reverseArray(int arr[],int st,int end){
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
    }

    public static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        rotate(arr, 3);
        printArray(arr);
        

    }
    
}
