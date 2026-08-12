// Last updated: 8/12/2026, 9:20:48 PM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");

        if(pattern.length() != str.length){
            return false;
        }

        Map<Object , Integer > map = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){
            if(!Objects.equals(map.put(pattern.charAt(i) , i) , (map.put(str[i] , i)))){
                return false;
            }
        }
        return true;

    }
}