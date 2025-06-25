public class Leetcode485_ConsecutiveOnes {
    static int ConsecutiveOnes(int nums[]) {
        int count = 0, prevCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (prevCount < count) {
                    prevCount = count;
                }
            }else{
                count=0;
            }
        }
        return prevCount;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 1, 1, 1 };
        System.out.println(ConsecutiveOnes(arr));
    }

}
