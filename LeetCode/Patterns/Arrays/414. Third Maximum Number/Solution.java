class Solution {
    public int thirdMax(int[] nums) {
        long max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for(int i : nums){
            if(i > max){
                thirdMax = secMax;
                secMax = max;
                max = i;
            } else if (i != max && i > secMax){
                thirdMax = secMax;
                secMax = i;
            } else if((i != max) && (i != secMax)
                        && i > thirdMax ){
                            thirdMax = i;
                        }

        }
        if(thirdMax == Integer.MIN_VALUE){
            return max;
        }
        return thirdMax;
    }
}