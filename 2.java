class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 0;
        int[] expectedNums = new int[nums.length];
        int j = 0;

        while (i < nums.length) {

            if (i == 0) {
                expectedNums[j] = nums[i];
                j++;
            }
            else if (nums[i] != expectedNums[j-1]) {
                expectedNums[j] = nums[i];
                j++;
            }

            i++;
        }

        for (int k = 0; k < j; k++) {
            nums[k] = expectedNums[k];
        }

        return j;
    }
}