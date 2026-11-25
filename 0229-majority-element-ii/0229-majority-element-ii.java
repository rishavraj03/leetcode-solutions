class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(result.contains(nums[i])){
                continue;             
            }
            else{
                int count = 0;
                for(int j=0;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        count++;
                    }
                }
                if(count>nums.length/3){
                    result.add(nums[i]);
                }
                if(result.size()==2){
                    break;
                }
            }
        }
        return result;
    }
}