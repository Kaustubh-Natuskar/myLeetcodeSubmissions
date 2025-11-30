class Solution {
    public List<Integer> majorityElement(int[] n) {
        List<Integer> ans = new ArrayList<Integer>();
        int m1=0, m2=1;
        int c1=0, c2=0;

        for(int i=0; i<n.length; i++) {
            if(m1 == n[i])
                c1 = c1+1;
            else if(m2 == n[i])
                c2 = c2+1;
            else if(c1 == 0) {
                m1 = n[i];
                c1=1;
            } else if(c2 == 0) {
                m2 = n[i];
                c2=1;
            } else {
                c1 = c1-1; 
                c2 = c2-1;
            }
        }

        c1=0;
        c2=0;
        for(int i=0; i<n.length; i++) {
            if(n[i] == m1)
                c1 = c1 +1;
            else if(n[i] == m2)
                c2 = c2 +1;
        }

        if(c1 > n.length/3)
            ans.add(m1);

        if(c2 > n.length/3)
            ans.add(m2);

        return ans;
    }
}