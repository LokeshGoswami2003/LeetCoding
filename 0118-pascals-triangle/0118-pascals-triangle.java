class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> l1=new ArrayList<Integer>();
        l1.add(1);
        list.add(l1);
        if(numRows==1)
            return list;
        List<Integer> l2=new ArrayList<Integer>();
        l2.add(1);
        l2.add(1);
        list.add(l2);
        for(int n=3;n<=numRows;n++){
            List<Integer> nth=new ArrayList<Integer>();
            nth.add(1);
            for(int i=0;i<list.get(n-2).size()-1;i++){
                nth.add(list.get(n-2).get(i)+list.get(n-2).get(i+1));
            }
            nth.add(1);
            list.add(nth);
        }
        return list;
    }
}