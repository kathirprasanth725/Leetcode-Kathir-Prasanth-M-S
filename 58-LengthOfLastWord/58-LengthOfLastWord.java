// Last updated: 8/11/2026, 2:19:42 PM
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.stripTrailing();
        int length=0;
        for(int i=s.length()-1;i>=0;i--){
          if(s.charAt(i)==' '){
          return length;
          }
        length++;
        }
        return length;
    }
    }
