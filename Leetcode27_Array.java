import java.util.*;

// Input: nums = [0,1,2,2,3,0,4,2], val = 2
// Output: 5, nums = [0,1,4,0,3,,,_]

public class Leetcode27_Array {
    public static int remove_element(int nums[],int val){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;

            }
        }
        return j;
    }
    public static void main(String[] args) {
        int nums[]={0,1,2,2,3,0,4,2};
        int val = 2;
        int b = remove_element(nums, val);
        System.out.println(b);
        
    }
}
