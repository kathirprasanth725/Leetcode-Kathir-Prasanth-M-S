// Last updated: 9/11/2026, 9:22:28 AM
class Solution {
    public int countGoodRotations(int[] nums) {
     int n=nums.length;
     int half=n/2;

        int [] p=nums;
        long total=0;
        for(int x:nums){
            total+=x;
        }
        long firsthalf=0;
        for(int i=0;i<half;i++){
            firsthalf+=nums[i];
        }
        int answer=0;
        for(int st=0;st<n;st++){
            long sechalf=total-firsthalf;

            if(firsthalf>sechalf){
                answer++;
            }

            firsthalf-=nums[st];
            firsthalf+=nums[(st+half)%n];
        }
        return answer;
    }
}