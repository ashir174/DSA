public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        throw new IllegalArgumentException("No solution exists");
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        // Example 1
        int[] nums1 = {1,7,6,2};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Result: [" + result1[0] + ", " + result1[1] + "]");

        // Example 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Result: [" + result2[0] + ", " + result2[1] + "]");

        // Example 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Result: [" + result3[0] + ", " + result3[1] + "]");
    }
}
