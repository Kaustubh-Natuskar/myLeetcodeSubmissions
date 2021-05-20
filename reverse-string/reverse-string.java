class Solution {
    public void reverseString(char[] s) {
        int len=s.length;
        int last=len-1;
        int mid=len/2;
        
        for(int i=0;i<mid;i++){
            char temp=s[i];
            s[i]=s[last];
            s[last]=temp;
            last--;
        }
    }
}