// Last updated: 9/11/2026, 9:28:09 AM
class Solution {
    public int fib(int n) {
   if(n==0||n==1)
   return n;
   int n1=0,n2=1,ans=0;
   for(int i=2;i<=n;i++){
    ans=n1+n2;
    n1=n2;
    n2=ans;
   }       
   return ans; 
    }
}