class Solution {
    // Optimized : Time and Space Complexities O(n)
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        List<Integer> st = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(asteroids[i] > 0){
                st.add(asteroids[i]);
            } else {
                int curr = Math.abs(asteroids[i]);
                while(!st.isEmpty() && st.get(st.size() - 1) > 0 && 
                st.get(st.size() - 1) < curr){
                    st.remove(st.size() - 1);
                }

                if(!st.isEmpty() && st.get(st.size() - 1) == curr){
                    st.remove(st.size() - 1);
                } else if (st.isEmpty() || st.get(st.size() - 1) < 0){
                    st.add(asteroids[i]);
                }
            }
        }

        int[] res = new int[st.size()];
        int idx = 0;
        for(int num : st){
            res[idx++] = num;
        }
        return res;
    }
}