// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.segregateElements(a, n);
            
            for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
            
            System.out.println();
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public void segregateElements(int a[], int n)
    {
        int[] temp = new int[n];
        
        int i=0, j=0;
        
        while(i<n){
            if(a[i] >=0){
                temp[j]=a[i];
                j++; 
            }
                i++;
            
        }
        i=0;
        //System.out.print("j is"+j);
        while(i<n){
            if(a[i] < 0){
                temp[j]=a[i];
                j++; 
            }
                i++;
            
        }
        for(int k=0; k<n; k++){
            a[k]=temp[k];
        }
        
        
    }
}