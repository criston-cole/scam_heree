class Solution {
    public int maxDistinct(String s) {
        boolean[] arr = new boolean[26];
        int res = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!arr[ch-'a']){
                res++;
                arr[ch-'a'] = true;
            }
        }
        return res;
    }
}