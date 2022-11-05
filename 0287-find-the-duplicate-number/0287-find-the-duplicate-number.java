class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int k=nums[i]<0?nums[i]*-1:nums[i];
            if(nums[k]<0){
                return k;
            }
            nums[k]*=-1;
        }
        return 0;
    }
}