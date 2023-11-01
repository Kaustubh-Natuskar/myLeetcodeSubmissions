class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE, n = nums.length;
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i=0; i<n; i++){
            int curr = nums[i];
            if(cnt1 == 0 && curr != ele2){
                ele1 = curr;
                cnt1++;
            } else if(cnt2 == 0 && curr != ele1){
                ele2 = curr; 
                cnt2++;
            } else if(curr == ele1)
                cnt1++;
            else if(curr == ele2)
                cnt2++;
            else{
                cnt1--; 
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        int min = (int)(n/3) + 1;
        for(int i=0; i<n; i++){
            if(nums[i] == ele1) cnt1++;
            if(nums[i] == ele2) cnt2++;
        }

        ArrayList<Integer> l = new ArrayList<Integer>();
        if(cnt1 >= min) l.add(ele1);
        if(cnt2 >= min) l.add(ele2);

        return l; 
    }
}