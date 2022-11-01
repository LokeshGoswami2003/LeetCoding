class Solution {
    public void setZeroes(int[][] matrix) {
    
        boolean isColZero=false;
        boolean isRowZero=false;
        
        // checking if any element in 0th col is zero
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0){
                isColZero=true;
                break;
            }
        }
        
        // checking if any element in 0th row is zero
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[0][j]==0){
                isRowZero=true;
                break;
            }
        }
        
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        
        for(int i=1;i<matrix.length;i++){
            if(matrix[i][0]==0){
                setthatrow(matrix,i);
            }
        }
        
        for(int j=1;j<matrix[0].length;j++){
            if(matrix[0][j]==0){
                setthatcol(matrix,j);
            }
        }
        
        if(isRowZero)
            setthatrow(matrix,0);
        if(isColZero)
            setthatcol(matrix,0);
    }
    
    public void setthatrow(int[][] matrix,int row){
        for(int col=0;col<matrix[0].length;col++){
            matrix[row][col]=0;
        }
    }
    public void setthatcol(int[][] matrix,int col){
        for(int row=0;row<matrix.length;row++){
            matrix[row][col]=0;
        }
    }
}