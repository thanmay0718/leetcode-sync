class Solution {
    public int strStr(String haystack, String needle) {
        // Constant approach O(1)
        if(needle.isEmpty()){
            return -1;
        }
        return haystack.indexOf(needle);
    }
}