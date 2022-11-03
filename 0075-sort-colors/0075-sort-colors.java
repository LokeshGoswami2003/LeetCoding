class Solution {
    public void sortColors(int[] nums) {
        int ini=0;
        int fi=nums.length-1;
        int flow=0;
        while(flow<=fi){
            if(nums[flow]==2){
                swap(nums,fi,flow);
                fi--;   
                continue;
            }
            if(nums[flow]==1){
                flow++;
                continue;
            }
            if(nums[flow]==0){
                swap(nums,ini,flow);
                ini++;
                flow++;
                continue;
            }
            
        }
    }
    public void swap(int[] nums,int p1,int p2){
        int temp=nums[p1];
        nums[p1]=nums[p2];
        nums[p2]=temp;
    }
}