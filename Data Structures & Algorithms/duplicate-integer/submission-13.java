class Solution {
    public boolean hasDuplicate(int[] nums) {

        for (int j = 0; j < nums.length; j++) {
            for (int k = j + 1; k < nums.length; k++) {

                if (nums[j] == nums[k]) {
                    return true;
                }
            }
        }

        return false;
    }
}