class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high =0;
        for(int i:piles){
            high = Math.max(high,i);
        }
        int res = high;
        while(low <= high){
            int mid = low + (high-low)/2;
            long hours=0;
            for(int i:piles){
                hours += (i+mid-1)/mid;
            }
            if(hours <= h){  
                res = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }
}