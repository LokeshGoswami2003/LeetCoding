class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> pascal = new ArrayList<List<Integer>>(numRows);
        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            int j;
            for( j = 1;j<i;j++){
                row.add(pascal.get(i-1).get(j)+pascal.get(i-1).get(j-1));
                    
            }
            if(j==i)
                row.add(1);
            pascal.add(row);
        }
        return pascal;
    }
}