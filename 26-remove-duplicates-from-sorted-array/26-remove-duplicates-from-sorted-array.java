class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int currele=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==currele)
                continue;
            if(nums[i]!=currele){
                nums[k]=nums[i];
                currele=nums[i];
                k++;
            }
        }
        return k;
    }
}