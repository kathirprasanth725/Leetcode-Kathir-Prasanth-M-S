// Last updated: 8/11/2026, 2:20:14 PM
class Solution {
    public int reverse(int x) {
        long ans=0;
        while(x!=0){
         long d = x%10;
            ans=ans*10+d;
            x/=10;
        }
     
        if(ans<=Integer.MIN_VALUE || ans>=Integer.MAX_VALUE)
        return 0;
        else return (int)ans;
       
    }
    }
