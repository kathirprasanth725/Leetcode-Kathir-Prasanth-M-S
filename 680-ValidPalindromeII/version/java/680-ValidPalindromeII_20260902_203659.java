// Last updated: 9/2/2026, 8:36:59 PM
1class Solution {
2    public boolean validPalindrome(String s) {
3    int left=0;
4    int right=s.length()-1;
5
6    while(left<right){
7        if(s.charAt(left)!=s.charAt(right)){
8        return ispalindrome(s,left+1,right) || ispalindrome(s,left,right-1);
9
10        }
11        left++;
12        right--;
13    }
14    return true;
15    }
16    private boolean ispalindrome(String s,int left,int right){
17        while(left<right){
18            if(s.charAt(left)!=s.charAt(right)){
19                return false;
20            }
21            left++;
22            right--;
23        }
24        return true;
25    }
26}