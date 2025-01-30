class Solution {
    /*public int[] intersection(int[] nums1, int[] nums2) {
        int i=0, j=0;
        List<Integer> list = new ArrayList<>();

        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            } else if(nums1[i] > nums2[j]) {
                j++;
            } else {
                list.add(nums1[i]);
                i++; j++;
            }
        }

        int[] res = new int[list.size()];
        for(int k=0; k<list.size(); k++){
            res[k] = list.get(k);
        }

        return res;
    } */
        public int[] intersection(int[] nums1, int[] nums2) {
        int i=0, j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();

        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            } else if(nums1[i] > nums2[j]){
                j++;
            } else {
                if(list.isEmpty() || list.get(list.size()-1) != nums1[i])
                    list.add(nums1[i]);
                i++; j++;
            }
        }

        int[] res = new int[list.size()];
        for(int k=0; k<list.size(); k++){
            res[k] = list.get(k);
        }

        return res;
    }
}