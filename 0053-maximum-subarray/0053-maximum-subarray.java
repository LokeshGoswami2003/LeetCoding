class Solution {
    public int maxSubArray(int[] nums) {
        int maxconsum=nums[0];
        int thissum=0;
        for(int i=0;i<nums.length;i++){
            thissum+=nums[i];
            maxconsum=(thissum>maxconsum)?thissum:maxconsum;
            if(thissum<0)
                thissum=0;
        }
        return maxconsum;
    }
}