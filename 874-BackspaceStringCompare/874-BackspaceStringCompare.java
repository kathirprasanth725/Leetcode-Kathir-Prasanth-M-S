// Last updated: 8/11/2026, 2:17:09 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack<>();
        Stack<Character> t1=new Stack<>();
        for(char i: s.toCharArray()){
            
               if(i=='#')
            {
             if(!s1.isEmpty())
                s1.pop();
            }
            else s1.push(i);
        
        }
        for(char j:t.toCharArray()){
           
            if(j=='#')
            {
              if(!t1.isEmpty())
                t1.pop();
            }
             else t1.push(j);
        }
        // StringBuilder sb1= new StringBuilder();
        // StringBuilder sb2 = new StringBuilder();
        
        // for(int i=0;i<s1.size()-1;i++){
        //     sb1.append(s1);
        // }
        // for(int i=0;i<t1.size()-1;i++){
        //     sb2.append(t1);
        // }
        // if(s1.equals(t1)){
        //     return true;
        // }
        // else
        // return false;

        if(s1.equals(t1))
        return true;
        else
        return false;

    }
}