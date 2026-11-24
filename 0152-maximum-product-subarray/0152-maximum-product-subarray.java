class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int maxPro = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp = max;
                max = min;
                min = temp;
            }
            if(max*nums[i]>nums[i]){
                max = max*nums[i];
            }
            else{
                max = nums[i];
            }
            if(min*nums[i]<nums[i]){
                min = min*nums[i];
            }
            else{
                min = nums[i];
            }
            if(max>maxPro){
                maxPro = max;
            }
        }
        return maxPro;
    }
}