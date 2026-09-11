// Last updated: 9/11/2026, 9:24:15 AM
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            char first=words[i].charAt(0);
            char last=words[i].charAt(words[i].length()-1);

            if(isvowel(first) && isvowel(last)){
                count++;
            }
        }
        return count;
    }
    public boolean isvowel(char ch){
      return  ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}