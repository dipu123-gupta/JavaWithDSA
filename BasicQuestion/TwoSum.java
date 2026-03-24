public class TwoSum {
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = { 2, 7, 1, 15 };
        int target = 18;
        int[] result = solution.twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }

    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[0]; // Return an empty array if no solution is found
    }

}

// https://leetcode.com/problems/two-sum/
