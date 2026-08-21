class Solution {
    public int numOfSubarrays(int[] arr) {
      int cnt = 0;
      for(int i = 0; i < arr.length; i++){
        int sum = 0;
        for(int j = i; j< arr.length; j++){
            sum += arr[j];
            if(sum % 2 == 1){
                cnt++;
            }
        }
      }
      return cnt;
    }
}