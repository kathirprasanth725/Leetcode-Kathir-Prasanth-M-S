// Last updated: 8/11/2026, 10:13:17 PM
1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3        String[] str = s.split(" ");
4
5        if(pattern.length() != str.length){
6            return false;
7        }
8
9        Map<Object , Integer > map = new HashMap<>();
10
11        for(int i=0; i<pattern.length(); i++){
12            if(!Objects.equals(map.put(pattern.charAt(i) , i) , (map.put(str[i] , i)))){
13                return false;
14            }
15        }
16        return true;
17
18    }
19}