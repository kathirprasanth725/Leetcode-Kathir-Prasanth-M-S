// Last updated: 8/11/2026, 2:17:00 PM
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