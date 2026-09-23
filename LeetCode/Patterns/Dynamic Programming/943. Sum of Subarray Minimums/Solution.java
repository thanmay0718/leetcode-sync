class Solution {

    private int[] findNSE(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        Deque<Integer> st = new ArrayDeque<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            nse[i] = !st.isEmpty() ? st.peek() : n;
            st.push(i);
        }

        return nse;
    }

    private int[] findPSE(int[] arr) {
        int n = arr.length;
        int[] pse = new int[n];
        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            pse[i] = !st.isEmpty() ? st.peek() : -1;
            st.push(i);
        }

        return pse;
    }

    public int sumSubarrayMins(int[] arr) {

        int n = arr.length;

        int[] nse = findNSE(arr);
        int[] pse = findPSE(arr);

        int mod = (int) 1e9 + 7;
        long sum = 0;

        for (int i = 0; i < n; i++) {

            int l = i - pse[i];
            int r = nse[i] - i;

            long freq = 1L * l * r;

            sum = (sum + freq * arr[i]) % mod;
        }

        return (int) sum;
    }
}