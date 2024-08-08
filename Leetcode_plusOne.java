public class Leetcode_plusOne{
// Input: digits = [1,2,3]
// Output: [1,2,4]

public static int[] plusOne(int[] digits) {
    int n=digits.length;
    for(int i=n-1;i>=0;i--){
        if(digits[i]==9){
            digits[i]=0;
        }else{
            digits[i]++;
            return digits;
        }
    }

    int digit[]=new int[n+1];
    digit[0]=1;
    return digit;
}
public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}

public static void main(String[] args) {
    int arr[]={9,9,9};
    int digits[]=plusOne(arr);
    printArray(digits);
    

}
    
}

