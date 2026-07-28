class Solution {
    public int maximumProduct(int[] nums) {
        int first_max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        int third_max = Integer.MIN_VALUE;
        int first_min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>first_max){
                third_max = second_max;
                second_max = first_max;
                first_max = nums[i];
            }
            else if(nums[i]>second_max){
                third_max = second_max;
                second_max = nums[i];
            }
            else if(nums[i]>third_max){
                third_max = nums[i];
            }
             if(nums[i]<first_min){
                second_min = first_min;
                first_min = nums[i];
             }
             else if(nums[i]<second_min){
                second_min = nums[i];
             }
        }
        int psts = first_max*second_max*third_max;
        int ngsps = first_max*first_min*second_min;
        return Math.max(psts,ngsps);
    }
}