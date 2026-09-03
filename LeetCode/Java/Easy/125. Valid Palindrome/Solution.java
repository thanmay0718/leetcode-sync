class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty() || s.length() == 1){
            return true;
        }
        StringBuilder res = new StringBuilder(); 
        for(int i = 0; i < s.length(); i++ ){
            char ch = Character.toLowerCase(s.charAt(i));
            if( (ch >= 'a' && ch <= 'z') || (ch >= 48 && ch <= 57) ){
                res.append(ch);
            }
        }

        int l = 0, r = res.length() - 1;
        while(l < r ){
            if( res.charAt(l) == res.charAt(r) ){
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}