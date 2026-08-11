// Last updated: 8/11/2026, 2:15:49 PM
class Solution {
    public int maxScore(int[] cardPoints, int k) {
    int n=cardPoints.length;
    int sum=0;
    for(int i=n-k;i<n;i++){
        sum+=cardPoints[i];
    }
    int max=sum;
    for(int i=0;i<k;i++){
        sum-=cardPoints[n-k+i];
        sum+=cardPoints[i];
        max=Math.max(sum,max);
    }
    return max;
    }
}