public class MaxSubarray {
    public static int maxSubArray(int[] nums) {
        int max_so_far = nums[0];
        int curr_max = nums[0];

        int size = nums.length;

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(nums[i], curr_max + nums[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }

        return max_so_far;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int submax = maxSubArray(nums);

        System.out.println(submax);
    }
}