class Solution {
    public int trap(int[] height) {
        int lmax = 0;
       int rmax = 0;
       int left = 0;
       int right = height.length-1;
       int water = 0;
       while(left<right){
        if(height[left]<height[right]){
            if(height[left]>=lmax){
                lmax=height[left];
            }
            else{
                water = water+lmax-height[left];
            }
            left++;
        }
        else{
            if(height[right]>=rmax){
                rmax=height[right];
            }
            else{
                water = water+rmax-height[right];
            }
            right--;
        }
       }
       return water;
    }
}