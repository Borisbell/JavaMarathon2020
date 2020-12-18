package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers, numbers.length));
    }

    public static int recursionSum(int[] nums, int n) {
        if (n == 0) {
            return 0;
        }
        return recursionSum(nums, n - 1) + nums[n - 1];
    }
}
