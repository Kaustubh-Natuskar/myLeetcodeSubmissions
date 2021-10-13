class Solution {
    public int fib(int n) {
       if (n==0)
            return 0;
        if(n==1)
            return 1;
        int oneMinus=fib(n-1);
        int twoMinus=fib(n-2);
        return oneMinus + twoMinus;
    }
   
}