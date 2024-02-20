package greedy;

public class P11ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int startIndex = 0;
        int endIndex = 1;
        int maxArea = 0;
        for (int i=1; i<height.length; i++){
            int currArea = (i - startIndex) * Math.min(height[startIndex], height[i]);
            if (currArea > maxArea){
                maxArea = currArea;
            }
        }


        System.out.println("Index: " + startIndex + " - " + endIndex);
        return (maxArea);
    }
}
