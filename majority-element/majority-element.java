class Solution {
    public int majorityElement(int[] num) {
        int maj=num[0], c=1;
        for(int i=1;i<num.length;i++){
            if(c==0){
                maj=num[i];
                c++;
            }else if(maj==num[i]){
                c++;
            }else
                c--;
        }
        return maj;
    }
}