// Last updated: 8/11/2026, 2:20:12 PM
class Solution {
    public boolean isPalindrome(int x) {
        int ans=0;
        int temp=x;
        while(x!=0){
           int d=x%10;
          ans=ans*10+d;
          x=x/10;
        }
        if(ans==temp && ans>=0)
        return true;
        else
        return false;
    }
}