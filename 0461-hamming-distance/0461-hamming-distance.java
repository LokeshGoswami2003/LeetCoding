class Solution {
    public int hammingDistance(int x, int y) {
       int cx=x^y;
        int mask=1;
        int c=0;
        for(int i=0;i<32;i++){
            if((cx&mask)!=0){
                c++;
            }
            mask<<=1;
        }
        return c;
    }
}