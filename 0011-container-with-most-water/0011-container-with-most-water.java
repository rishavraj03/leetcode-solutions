class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right = height.length-1;
        int maxarea=0;
        while(left<right){
            int length = 0;
            int width = right - left;
            if(height[left]<height[right]){
                length = height[left];
            }
            else{
                length = height[right];
            }
            int area = length*width;
            if(area>maxarea){
                maxarea = area;
            }
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
}