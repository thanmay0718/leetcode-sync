class Solution {
    // Optimal Approach : No extra space O(1) and traversing time in worst case is O(n)
    public int maxDepth(String s) {
        int cnt = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                cnt++;
                max = Math.max(max, cnt);
            } else if (ch == ')') {
                cnt--;
            }
        }
        return max;
    }
}