package org.example.Nums;

public class FirstMissingPositive {
    //缺失的最小正整数
    public static int firstMissingPositive(int[] nums) {
        //如果数组的长度为5，那么结果只可能是在1到6
        int n = nums.length;

        // Step 1: 将所有无效数替换为 n+1
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }

        // Step 2: 利用符号标记数组中出现的数
        for (int i = 0; i < n; i++) {
            //取绝对值
            int num = Math.abs(nums[i]);
            //
            if (num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]); // 标记为负
            }
        }

        // Step 3: 找到第一个正数位置
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        // 如果全都标记了，返回 n+1
        return n + 1;
    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1, 2, 0}));      // 3
        System.out.println(firstMissingPositive(new int[]{3, 4, -1, 1})); // 2
        System.out.println(firstMissingPositive(new int[]{7, 8, 9, 11})); // 1
    }
}
