class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digits="123456789";
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=9;i++){
            for(int j=0;j+i<=9;j++){
                String sub=digits.substring(j,i+j);
                int value=Integer.parseInt(sub);
                if(value>=low&&value<=high)
                    list.add(value);
            }
        }
        return list;
    }
}