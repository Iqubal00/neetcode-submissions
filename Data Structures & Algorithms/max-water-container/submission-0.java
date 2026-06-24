class Solution {
    int max = 0;
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;

        int maxWater = 0;

        while(left < right){
            int width = right - left;
        

        int minHeight = Math.min(heights[left], heights[right]);

        int area = minHeight * width;
        maxWater = Math.max(maxWater, area);

        if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}
