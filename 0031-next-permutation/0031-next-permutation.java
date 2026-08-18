class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        int left=0;
        int right=n-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        if(index==-1){
            while(left<right){
                int temp = nums[left];
                nums[left]= nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
            return;
        }
        for(int t=n-1;t>index;t--){
            if(nums[t]>nums[index]){
                int temp = nums[t];
                nums[t]=nums[index];
                nums[index]=temp;
                break;
            }
        }
        while(index+1<n-1){
            int temp = nums[index+1];
            nums[index+1]=nums[n-1];
            nums[n-1]=temp;
            index++;
            n--;
        }
    }
}