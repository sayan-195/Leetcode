import java.util.*;

//Trapping Rainwater

public class Leetcode42_TrappedRainwater {
    public static int trappedRainwater(int height[]){
        //Calculate Leftmax boundary

        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i =1;i<height.length;i++){
            leftmax[i]=Math.max(height[i], leftmax[i-1]);
        }
        //Calculate RightMax boundary
        int rightMax[]=new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for(int i = height.length-2;i>=0;i--){
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }

        //Calculate Water level
        int waterLevel[]=new int [leftmax.length];
        for(int i=0;i<leftmax.length;i++){
            waterLevel[i]=Math.min(leftmax[i], rightMax[i]);
        }

        int trappRainwater=0;
        for(int i =0;i<waterLevel.length;i++){
            trappRainwater+=(waterLevel[i]-height[i]);
        }
        return trappRainwater;

    }
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappedRainwater(height));
    }
}
