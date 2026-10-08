class Solution {
    public void help(Map<Character,List<Character>> refer,List<String> res,String temp,String dig,int idx){
        if(temp.length()==dig.length()){
            res.add(temp);
            return;
        }
        for(char i:refer.get(dig.charAt(idx))){
       help(refer,res, temp+i, dig, idx + 1);
        }


    }
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length()==0){
            return res;
        }
        Map<Character,List<Character>> refer = new HashMap<>();
        refer.put('2',new ArrayList<Character>(Arrays.asList('a','b','c')));
        refer.put('3',new ArrayList<Character>(Arrays.asList('d','e','f')));
        refer.put('4',new ArrayList<Character>(Arrays.asList('g','h','i')));
        refer.put('5',new ArrayList<Character>(Arrays.asList('j','k','l')));
        refer.put('6',new ArrayList<Character>(Arrays.asList('m','n','o')));
        refer.put('7',new ArrayList<Character>(Arrays.asList('p','q','r','s')));
        refer.put('8',new ArrayList<Character>(Arrays.asList('t','u','v')));
        refer.put('9',new ArrayList<Character>(Arrays.asList('w','x','y','z')));
        help(refer,res,"",digits,0);
        return res;
    }
}