1class Solution {
2    public List<String> letterCombinations(String digits) {
3        HashMap<Character,String> map = new HashMap<>();
4        List<String> list = new ArrayList<>();
5        if(digits==null||digits.length()==0)return list;
6        map.put('2',"abc");
7        map.put('3',"def");
8        map.put('4',"ghi");
9        map.put('5',"jkl");
10        map.put('6',"mno");
11        map.put('7',"pqrs");
12        map.put('8',"tuv");
13        map.put('9',"wxyz");
14        
15        backtrack(digits,0,map,list,new StringBuilder());
16        return list;
17    }
18    void backtrack(String digits, int index, HashMap<Character,String> map, List<String> list, StringBuilder current){
19        if(index==digits.length()){
20            list.add(current.toString());
21            return;
22        }
23        String letters = map.get(digits.charAt(index));
24        if(letters==null)return;
25        for(char c:letters.toCharArray()){
26            current.append(c);
27            backtrack(digits,index+1,map,list,current);
28            current.deleteCharAt(current.length()-1);
29        }
30    }
31}