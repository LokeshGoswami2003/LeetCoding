class Solution {
    public int majorityElement(int[] nums) {
        int x=nums[0];
        int fre=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==x){
                fre++;
                continue;
            }
            if(nums[i]!=x){
                fre--;
            }
            if(fre==0){
                x=nums[i];
                fre=1;
            }
        }
        return x;
    }
}