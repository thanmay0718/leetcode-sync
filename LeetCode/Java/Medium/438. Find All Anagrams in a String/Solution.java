class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int slen = s.length();
        int plen = p.length();
        if(slen < plen){
            return list;
        }

        char[] sWindow = p.toCharArray();
        Arrays.sort(sWindow);
        for(int i = 0; i <= slen - plen; i++){
            char[] pWindow = s.substring(i, i + plen).toCharArray();
            Arrays.sort(pWindow);
            if(Arrays.equals(sWindow, pWindow)){
                list.add(i);
            }
        }
        return list;
    }
}