class Solution {
    public void help(List<Integer> temp,List<List<Integer>> res,int idx,int [] nums){
        if(idx>=nums.length){
            res.add(new ArrayList<>(temp));
            return; 
        }
        temp.add(nums[idx]);
        help(temp,res,idx+1,nums);
        temp.removeLast();
        help(temp,res,idx+1,nums);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        help(temp,res,0,nums);
        return res;
    }
}