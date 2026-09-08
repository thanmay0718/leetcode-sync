class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int[] greaterElements = new int[nums1.length];
        Arrays.fill(greaterElements, -1);

        for (int i = 0; i < nums1.length; i++) {
            int val = nums1[i];
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == val) {
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > val) {
                            greaterElements[i] = nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return greaterElements; 
    }
}