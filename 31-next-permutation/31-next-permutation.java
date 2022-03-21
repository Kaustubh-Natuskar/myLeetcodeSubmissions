class Solution {
    public void nextPermutation(int[] A) {
        int n=A.length-2;
        while(n>=0 && A[n] >= A[n+1]) 
            n--;
        if(n>=0){
            int i=A.length-1;
            while(A[i] <= A[n])
                i--;
            swap(A,n,i);
        }
        reverse(A,n+1,A.length-1);
    }
    public void swap(int[] A, int a, int b){
        int temp=A[a];
        A[a]=A[b];
        A[b]=temp;
    }
    public void reverse(int[] A, int a, int b){
        while(a<b)
            swap(A,a++,b--);
    }
}