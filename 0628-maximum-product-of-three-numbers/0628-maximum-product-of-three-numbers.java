class Solution {
    public int maximumProduct(int[] nums) {
        int first_max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        int third_max = Integer.MIN_VALUE;
        int first_min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
        for(int n:nums){
            if(n>first_max){
                third_max = second_max;
                second_max = first_max;
                first_max = n;
            }
            else if(n>second_max){
                third_max = second_max;
                second_max = n;
            }
            else if(n>third_max){
                third_max = n;
            }
             if(n<first_min){
                second_min = first_min;
                first_min = n;
             }
             else if(n<second_min){
                second_min = n;
             }
        }
        int psts = first_max*second_max*third_max;
        int ngsps = first_max*first_min*second_min;
        return Math.max(psts,ngsps);
    }
}