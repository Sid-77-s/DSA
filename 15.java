class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> Btriple = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                int x = nums[i];
                int y = nums[j];
                int z = -(x + y);

                for (int k = j + 1; k < nums.length; k++) {

                    if (nums[k] == z) {

                        List<Integer> triplet =
                            Arrays.asList(x, y, z);

                        Collections.sort(triplet);

                        if (!Btriple.contains(triplet)) {
                            Btriple.add(triplet);
                        }
                    }
                }
            }
        }

        return Btriple;
    }
}