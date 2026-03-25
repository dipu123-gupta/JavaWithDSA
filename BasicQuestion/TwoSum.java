public class TwoSum {
    public static void main(String[] args) {
        // ! Create an instance of the TwoSum class and test the twoSum method with a
        // sample input
        TwoSum solution = new TwoSum();
        int[] nums = { 2, 7, 11, 15 };// ! Sample input array
        int target = 18;// ! Sample target value
        int[] result = solution.twoSum(nums, target);// ! Call the twoSum method and store the result in a variable
        if (result.length == 2) {// ! Check if a valid solution is found (length of result should be 2)
            System.out.println("Indices: " + result[0] + ", " + result[1]);// ! Print the indices of the two numbers
                                                                           // that add up to the target
        } else {
            System.out.println("No two sum solution found.");
        }

    }

    public int[] twoSum(int[] nums, int target) {
        // ! Iterate through the array and check for each pair of numbers if their sum
        // equals the target
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
