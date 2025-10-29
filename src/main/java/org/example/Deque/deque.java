package org.example.Deque;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class deque {
    //Deque<Integer> deque = new ArrayDeque<>();
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];
        int resultIndex = 0;

        // 使用双端队列存储下标
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // 1. 移除超出窗口范围的元素
            //while判断条件，不符合条件的不执行，符合条件的才执行
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // 2. 移除所有小于当前元素的元素
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // 3. 添加当前元素的下标
            deque.offer(i);

            // 4. 当窗口大小达到k时，开始记录结果
            if (i >= k - 1) {
                result[resultIndex++] = nums[deque.peek()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {9, 2, 7, 4, 5, 8, 4};
        int k = 3;

        int[] result = maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(result));
        // 输出: [9, 7, 7, 5, 8, 8]
    }
}
