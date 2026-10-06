// Last updated: 10/6/2026, 7:52:06 PM
1class Solution {
2    public void reverseString(char[] s) {
3      reverse(s,0);
4    }
5    private void reverse(char arr[],int i){
6        if(i>=arr.length/2)
7        return;
8
9        char temp=arr[i];
10        arr[i]=arr[arr.length-1-i];
11        arr[arr.length - 1 - i] = temp;
12        
13        reverse(arr, i + 1);
14    }
15}