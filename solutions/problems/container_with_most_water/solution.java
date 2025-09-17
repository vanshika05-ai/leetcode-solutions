class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            int area = h * width;
            maxArea = Math.max(maxArea, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

     public static void main(String[] args) {
        int[] height = {6, 3, 6, 9, 7, 9};
        Solution t = new Solution();
        System.out.println(t.maxArea(height));
    }
}
