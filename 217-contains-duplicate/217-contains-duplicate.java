class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int pre = nums[0];
        for(int i = 1 ; i<len ; i++){
            if(nums[i]==pre)
                return true;
            pre = nums[i];
        }
        return false;
    }
}