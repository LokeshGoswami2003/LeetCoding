class Solution {
    public void setZeroes(int[][] matrix) {
        
        int[][] clone=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                clone[i][j]=matrix[i][j];
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    modify(clone,i,j);
                }
            }
        } 
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=clone[i][j];
            }
        }
    }
    
    public void modify(int[][] clone,int i,int j){
        for(int row=0;row<clone.length;row++){
            clone[row][j]=0;
        }
        for(int col=0;col<clone[0].length;col++){
            clone[i][col]=0;
        }
    }
}