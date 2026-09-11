// Last updated: 9/11/2026, 9:27:32 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int nagamani=0,m=1;
        int temp=n;
        while(n!=0){
         int d=n%10;
            m=m*d;
            n/=10;
        }
        while(temp!=0){
        int d1=temp%10;
        nagamani+=d1;
        temp/=10;
        }
        return m-nagamani;
    }
}