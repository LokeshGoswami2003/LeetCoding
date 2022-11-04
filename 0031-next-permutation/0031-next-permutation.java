class Solution {
    public void nextPermutation(int[] nums) {
        int len=nums.length-1;
        for(int i=len-1;i>=0;i--){
            if(nums[i]<nums[i+1]){
                int smalli=search(nums,i+1,nums[i]);
                // int thatno=nums[smalli];
                swap(nums,i,smalli);
                // for(int k=len;k<i+1;k--){
                //     if(nums[k]<that)
                // }
                reverse(nums,i+1,len);
                return;
            }
        }
        reverse(nums,0,len);
    }
    public int search(int[] nums,int from,int base){
        int minmax=from;
        for(int k=from;k<nums.length;k++){
            if(nums[k]>base){
                minmax=k;
            }
        }
        return minmax;
    }
    public void swap(int[] nums,int p1,int p2){
        int temp=nums[p2];
        nums[p2]=nums[p1];
        nums[p1]=temp;
    }
    public void reverse(int[] nums,int from,int till){
        while(from<=till){
            swap(nums,from,till);
            from++;
            till--;
        }
    }
}