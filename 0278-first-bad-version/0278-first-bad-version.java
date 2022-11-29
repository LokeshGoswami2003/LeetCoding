/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=1;
        int end=n;
        int pd=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isBadVersion(mid)){
                pd=mid;
                end=mid-1;
                continue;
            }
            else{
                start=mid+1;
            }
        }
        return pd;
    }
}