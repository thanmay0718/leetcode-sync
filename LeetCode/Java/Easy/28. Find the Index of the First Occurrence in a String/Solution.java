class Solution {
    public int strStr(String haystack, String needle) {
        // Constant approach O(n * m)
        if(needle.isEmpty()){
            return -1;
        }
        return haystack.indexOf(needle);
    }
}