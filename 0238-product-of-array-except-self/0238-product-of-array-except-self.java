class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*
        int[] res = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int skip=i, ans=1;
            for(int j=0; j<nums.length; j++){
                if(j == skip) continue;
                ans = ans * nums[j];
            }
            res[skip] = ans;
        }
        return res; //TLE //O(N^2)
        */
        /*int[] suf = new int[nums.length];
        int[] pre = new int[nums.length];
        int[] res = new int[nums.length];
        Arrays.fill(suf, 1);
        Arrays.fill(pre, 1);

        int prod = 1;
        for(int i=0; i<nums.length; i++){
            prod = nums[i] * prod;
            pre[i] = prod;
        }
        prod = 1;
        for(int i=nums.length-1; i>=0; i--){
            prod = nums[i] * prod;
            suf[i] = prod;
        }
        for(int i=0; i<nums.length; i++){
            if(i == 0){
                res[i] = suf[i+1];
                continue;
            }
            if(i == nums.length-1){
                res[i] = pre[i-1];
                continue;
            }
            res[i] = suf[i+1] * pre[i-1];
        }
        return res;
        /**
        Time: O(N) + O(N)
        Space: O(N)
        */

        int[] suf = new int[nums.length];
        int[] res = new int[nums.length];
        Arrays.fill(suf, 1);

        int prod = 1;
        for(int i=nums.length-1; i>=0; i--){
            prod = nums[i] * prod;
            suf[i] = prod;
        }

        prod = 1;
        for(int i=0; i<nums.length-1; i++){ //storing prefix product into input array
            prod = nums[i] * prod;
            nums[i] = prod;
        }

        for(int i=0; i<nums.length; i++){
            if(i == 0){
                res[i] = suf[i+1];
                continue;
            }
            if(i == nums.length-1){
                res[i] = nums[i-1];
                continue;
            }
            res[i] = suf[i+1] * nums[i-1];
        }
        return res;

    }
}