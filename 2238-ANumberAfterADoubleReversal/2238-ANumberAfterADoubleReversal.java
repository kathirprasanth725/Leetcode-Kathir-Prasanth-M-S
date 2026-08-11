// Last updated: 8/11/2026, 2:15:09 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num;
        int a=0;
        int b=0;
        int d;
        int x;
        while(num!=0){
        d=num%10;
        a=a*10+d;
        num=num/10; }
        while(a!=0){
        x=a%10;
        b=b*10+x;
        a=a/10;
    }
 
   if(temp==b)
   return true;
   else
   return false;
        
    }
}