class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int cp=matrix[0].length-1;
        int rp=0;
        while(cp>=0&&rp<matrix.length){
            if(matrix[rp][cp]==target)
                return true;
            if(target>matrix[rp][cp]){
                rp++;
                
            }
            else{
                cp--;
            }
        }
        return false;
    }
}