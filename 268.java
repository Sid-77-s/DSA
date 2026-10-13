class Solution {
    public int missingNumber(int[] nums) {
        
        int expectedSum = (nums.length*(nums.length+1))/2 ;
        int actualSum = 0;
        int i = 0;
        while (i < nums.length) {
            actualSum += nums[i];
            i++;
        }

        return expectedSum - actualSum ;
    }
}