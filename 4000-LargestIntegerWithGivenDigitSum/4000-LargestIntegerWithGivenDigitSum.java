// Last updated: 9/11/2026, 9:22:56 AM
class Solution {
    public int largestInteger(int n, int s) {
        if(s==0)
            return 0;
        if(s>9*n)
            return -1;
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++){
            int digit=Math.min(9,s);
            ans.append(digit);
            s-=digit;
        }
        // while(ans.length()>1 && ans.charAt(ans.length()-1)==0){
        //     ans.deleteCharAt(ans.length()-1);
        // }
        return Integer.parseInt(ans.toString());
    }
}