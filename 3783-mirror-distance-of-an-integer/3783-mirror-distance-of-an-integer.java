class Solution {
    public int mirrorDistance(int n) {
        int i = n;
       int rev =0;
       while(n>0){
        int r = n%10;
        rev = rev*10 + r;
        n = n/10;
       }
       int res = i-rev;
       return (res>=0)?res: -(res); 

    }
}