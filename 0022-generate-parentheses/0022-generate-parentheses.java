class Solution {
    public void solve(List<String> res , List<String> temp , int oc , int cc , int n){
        if(oc==cc && cc==n){
            res.add(String.join("",temp));
            return;
        }
        if(oc<n){
            temp.add("(");
            solve(res,temp,oc+1,cc,n);
            temp.removeLast();
        }
        if(cc<oc){
            temp.add(")");
            solve(res,temp,oc,cc+1,n);
            temp.removeLast();
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        solve(res,temp,0,0,n);
        return res;
    }
}