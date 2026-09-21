class Solution {
    public int lengthOfLongestSubstring(String s) {
       int l = 0, max = 0;
       HashMap<Character, Integer> map = new HashMap<>();
       for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
        if(map.containsKey(ch)){
            l = Math.max(l, map.get(ch) + 1);
        }
        map.put(ch, i);
        max = Math.max(max, i - l + 1);
       }
       return max;
    }
}