class Solution {
    public static List<Integer> solve(List<Integer> prev,int i){
        List<Integer> ll = new ArrayList<>();
        for(int j=0;j<i;j++){
            if(j==0||j==i-1){
                ll.add(1);
            }else{
                ll.add(prev.get(j-1)+prev.get(j));
            }
        }
        return ll;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l= new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        ll.add(1);
        l.add(ll);
        for(int i=2;i<=numRows;i++){
            l.add(solve(l.get(i-2),i));
        }
    return l;
    }
}