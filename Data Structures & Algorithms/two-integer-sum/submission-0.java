class Solution {

    // return indicies of nums that when summed equal target
    public int[] twoSum(int[] nums, int target) {
        // iterate through nums
        for (int i = 0; i < nums.length - 1; i++) { 
            for (int j = 1; j < nums.length; j++) { 
                if (i != j) {
                    if (nums[i] + nums[j] == target) { 
                        return new int[] {i,j};
                    }
                }
            }

        }

        return new int[] {-1}; 
    }
}
