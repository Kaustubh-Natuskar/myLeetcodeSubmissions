// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int N, int A[]){
        // code here
        
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
         List<Integer> al = new ArrayList<>();

        for (Integer g : A)
            al.add(g);
        return al;
        
    }
        public static void swap(int[] A, int a, int b){
        int temp=A[a];
        A[a]=A[b];
        A[b]=temp;
    }
    public static void reverse(int[] A, int a, int b){
        while(a<b)
            swap(A,a++,b--);
    }

}