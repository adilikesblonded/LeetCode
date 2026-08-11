class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        if(t.equals(s)) return t;
        HashMap<Character,Integer> required = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);

            if(required.containsKey(ch)) required.put(ch,required.get(ch)+1);
            else required.put(ch,1);
        }

        int left=0,right=0;
        HashMap<Character,Integer> window = new HashMap<>();
        int requiredCount = t.length();
        int currentCount =  0;
        int minLength = Integer.MAX_VALUE;
        int minLeft=0;

        while(right<s.length()){ // DADOBECODEBANC
            char ch = s.charAt(right);

            // add character to current window
            window.put(ch,window.getOrDefault(ch,0)+1);

            if(required.containsKey(ch) && window.get(ch) <= required.get(ch)){
                // if the text has the character and the required freq is not exceeded
                currentCount++;
            }
            
            while(currentCount == requiredCount){
                if(right-left+1 < minLength){
                    minLength = right-left+1;
                    minLeft = left;
                }

                char l = s.charAt(left); // remove it from the window
                window.put(l,window.get(l)-1); // window hashmap contains all characters currently in the window

                if(required.containsKey(l) && required.get(l) > window.get(l)){
                    currentCount--; // if the character removed is present in the text then the required characters are not met as the window slides
                }
                left++;
            }
            right++;
        }
        return minLength==Integer.MAX_VALUE?"":s.substring(minLeft,minLeft+minLength);
    }
}