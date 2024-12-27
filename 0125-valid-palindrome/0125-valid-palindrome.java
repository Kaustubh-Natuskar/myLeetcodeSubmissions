class Solution {
    public boolean isPalindrome(String s) {
         s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
         System.out.println(s);
         if(s.length() == 0) return true;
         int i=0, j=s.length()-1;

         while(i<j){
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
         }
         return true;
    }
}