class Solution {
    public int mirrorDistance(int n) {
        String s = String.valueOf(n);
        StringBuilder ss = new StringBuilder(s);
        ss.reverse();
        s = ss.toString();
        return Math.abs(n-Integer.parseInt(s)); 

    }
}