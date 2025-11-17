class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m+n-1;
        m = m - 1;
        n = n-1;

        while(n>=0) {
            if(m>=0 && nums1[m] > nums2[n]) {
                nums1[p] = nums1[m];
                m--;
            } else {
                nums1[p] = nums2[n];
                n--;
            }
            p--;
        }
    }
}