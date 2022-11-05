class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][1]<=end){
                continue;
            }
            if(intervals[i][0]<=end){
                end=intervals[i][1];
                continue;
            }
            list.add(new int[]{start,end});
            start=intervals[i][0];
            end=intervals[i][1];
        }
        list.add(new int[]{start,end});
        int[][] ans=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}