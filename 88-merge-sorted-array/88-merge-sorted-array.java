class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        int length=nums1.length;
        while(m!=-1 && n!=-1){
            if(nums1[m]>=nums2[n]){
                nums1[--length]=nums1[m];
                m--;
                continue;
            }
             if(nums1[m]<nums2[n]){
                nums1[--length]=nums2[n];
                n--;
            }
        }
        while(m!=-1)
            nums1[--length]=nums1[m--];
        while(n!=-1)
            nums1[--length]=nums2[n--];
        
    }
}
