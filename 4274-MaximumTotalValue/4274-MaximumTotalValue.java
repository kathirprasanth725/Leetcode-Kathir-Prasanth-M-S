// Last updated: 8/11/2026, 2:14:11 PM
class Solution {
    static final long MOD=1_000_000_007L;
    public int maxTotalValue(int[] value, int[] decay, int m) {
        int n=value.length;
        long low=1,high=1_000_000_000L;
        long th=0;
        while(low<=high){
            long mid=(low+high)>>>1;
            if(count(value,decay,mid)>=m){
                th=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        long totalcount=0;
        long totalsum=0;
        for(int i=0;i<n;i++){
            long v=value[i];
            long d=decay[i];
            if((v<th)) continue;
            long cnt=(v-th)/d+1;
            totalcount+=cnt;
            long last=v-(cnt-1)*d;
            totalsum+=cnt*(v+last)/2;
            totalsum%=MOD;
        }
        long extra=totalcount-m;
        totalsum=(totalsum-(extra%MOD)*(th%MOD))%MOD;
        if(totalsum<0) totalsum+=MOD;
        return(int) totalsum;
    }
    private long count(int[] value,int[] decay,long x){
        long cnt=0;
        for(int i=0;i<value.length;i++){
            long v=value[i];
            long d=decay[i];
            if(v>=x){
                cnt+=(v-x)/d+1;
            }
        }
        return cnt;
    }
}