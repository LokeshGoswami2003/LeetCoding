class Solution {
    public void rotate(int[][] matrix) {
        int len=matrix.length-1;
        int upper_row=0;
        int lower_row=len;
        int upper_col=0;
        int lower_col=len;
        while(upper_row<lower_row){
            for(int ele_no=upper_row;ele_no<lower_row;ele_no++){
                swapfour(matrix,ele_no,upper_row,lower_row,upper_row,lower_row);
            }
            upper_row++;
            lower_row--;
        }
    }
    public void swapfour(int[][] m,int e,int r1,int r2,int c1,int c2){
        int t1=m[r1][e];
        int t2=m[e][c2];
        int t3=m[r2][m.length-1-e];
        int t4=m[m.length-1-e][c1];
        m[r1][e]=t4;
        m[e][c2]=t1;
        m[r2][m.length-1-e]=t2;
        m[m.length-1-e][c1]=t3;
    }
}