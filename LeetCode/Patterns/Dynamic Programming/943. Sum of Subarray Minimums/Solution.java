class Solution {
    /* Function to find the indices of 
    next smaller elements */
    private int[] findNSE(int[] arr) {
        
        // Size of array
        int n = arr.length;
        
        // To store the answer
        int[] ans = new int[n];
        
        // Stack 
        Stack<Integer> st = new Stack<>();
        
        // Start traversing from the back
        for (int i = n - 1; i >= 0; i--) {
            
           
            /* Pop the elements in the stack until 
            the stack is not empty and the top 
            element is not the smaller element */
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            
            // Update the answer
            ans[i] = !st.isEmpty() ? st.peek() : n;
            
            /* Push the index of current 
            element in the stack */
            st.push(i);
        }
        
        // Return the answer
        return ans;
    }
    
    /* Function to find the indices of 
    previous smaller or equal elements */
    private int[] findPSE(int[] arr) {
        
        // Size of array
        int n = arr.length;
        
        // To store the answer
        int[] ans = new int[n];
        
        // Stack 
        Stack<Integer> st = new Stack<>();
        
        // Traverse on the array
        for (int i = 0; i < n; i++) {
            
          
            
            /* Pop the elements in the stack until 
            the stack is not empty and the top 
            elements are greater than the current element */
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            
            // Update the answer
            ans[i] = !st.isEmpty() ? st.peek() : -1;
            
            /* Push the index of current 
            element in the stack */
            st.push(i);
        }
        
        // Return the answer
        return ans;
    }

    /* Function to find the sum of the 
    minimum value in each subarray */
    public int sumSubarrayMins(int[] arr) {
        
        int[] nse = findNSE(arr);
        int[] pse = findPSE(arr);
        
        // Size of array
        int n = arr.length;
        
        int mod = (int)1e9 + 7; // Mod value
        
        // To store the sum
        int sum = 0;
        
        // Traverse on the array
        for (int i = 0; i < n; i++) {
            
            // Count of first type of subarrays
            int left = i - pse[i];
            
            // Count of second type of subarrays
            int right = nse[i] - i;
            
            /* Count of subarrays where 
            current element is minimum */
            long freq = left * right * 1L;
            
            // Contribution due to current element 
            int val = (int)((freq * arr[i]) % mod);
            
            // Updating the sum
            sum = (sum + val) % mod;
        }
        
        // Return the computed sum
        return sum;
    }
};