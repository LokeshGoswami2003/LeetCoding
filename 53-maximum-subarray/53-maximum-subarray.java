class Solution {
    public int maxSubArray(int[] nums) {
        int length=nums.length;
        int max_sum=nums[0];
        int partial_sum=0;
        for(int i=0;i<length;i++){
            partial_sum+=nums[i];
            
            max_sum=(partial_sum>max_sum) ? (partial_sum) : (max_sum);
            partial_sum=(partial_sum<0) ? (0) : (partial_sum);
            
        }
        return max_sum;
    }
}