public class Leetcode11_ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int mostWater=0;
        int i =0;
        int j =height.length-1;

        while(i<j){
            int h = Math.min(height[i], height[j]);
            int b = ((j+1)-(i+1));
            int currWater = h*b;
            if(currWater>mostWater){
                mostWater=currWater;
            }

            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
        }
            
        
        return mostWater;
    }
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));

    }
    
}
