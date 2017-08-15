public class Solution {
    public String longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int length=0;
        int temp;
        String result=null;
        for(int i=0,j=0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                temp = Math.max(length, (i - map.get(s.charAt(i))));
                if(temp>length){
                    result = s.substring(map.get(s.charAt(i)), i+1);
                }
                
            }
            map.put(s.charAt(i), i);
        }
        return result;
        
    }    
}