public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
           if(map.containsKey(s.charAt(i))){
               j = Math.max(j, map.get(s.charAt(i))+1);
           }
           
           max = Math.max(max, i+1-j);
           map.put(s.charAt(i), i);
              
           
           
        }
        return max;
    }
    public static void main(String[] args){
        Solution s = new Solution();
        String str = "pwwkew";
        
        System.out.println(s.lengthOfLongestSubstring(str));
    }
}