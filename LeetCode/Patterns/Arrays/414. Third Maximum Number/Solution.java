class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long secMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for(int i : nums){
            if (i == max || i == secMax || i == thirdMax) {
                continue;
            }
            if(i > max){
                thirdMax = secMax;
                secMax = max;
                max = i;
            } else if (i > secMax){
                thirdMax = secMax;
                secMax = i;
            } else if(i > thirdMax){
                thirdMax = i;
            }
        }
        return (int) (thirdMax == Long.MIN_VALUE ? max : thirdMax);
    }
}