package pers.cloud.FirstWeek;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxArea = (j - i) * Math.min(height[i], height[j]);
        while (i < j) {
            if (height[i] < height[j]) {
                i++;
                int area = (j - i) * Math.min(height[i], height[j]);
                maxArea = Math.max(maxArea, area);
            } else {
                j--;
                int area = (j - i) * Math.min(height[i], height[j]);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}
