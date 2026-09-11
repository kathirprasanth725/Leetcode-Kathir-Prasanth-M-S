// Last updated: 9/11/2026, 9:22:34 AM
class Solution {
    public int countRotations(String s, int k) {
        int n=s.length();
        int equal=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==s.charAt((i+1)%n)){
                equal++;
            }
        }
        int cir=equal;
        int un=n-equal;

        if(k==cir){
            return un;
        }
            else if(k==cir-1){
            return equal;
            }
        return 0;
    }
}