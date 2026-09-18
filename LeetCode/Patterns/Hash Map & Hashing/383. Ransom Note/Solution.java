class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] d = new int[26];
        for(int i = 0; i < ransomNote.length(); i++){
            d[ransomNote.charAt(i) - 'a']++;
        }

        for(int i = 0; i < magazine.length(); i++){
            d[magazine.charAt(i) - 'a']--;
        }

        for(int i = 0; i < d.length; i++){
            if(d[i] > 0){
                return false;
            }
        }
        return true;
    }
}