//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//
// 示例: 
//
// 输入: [-2,1,-3,4,-1,2,1,-5,4],
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
// 
//
// 进阶: 
//
// 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。 
// Related Topics 数组 分治算法 动态规划


package leetcode.editor.cn;

import java.util.ArrayList;

public class MaximumSubarray {
    public static void main(String[] args) {
        Solution solution = new MaximumSubarray().new Solution();
        int[] nums = {8,-19,5,-4,20};
        solution.maxSubArray(nums);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxSubArray(int[] nums) {
            ArrayList<Integer> arrayList1 = new ArrayList<>();
            int max ;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= 0){
                    arrayList1.add(nums[i]);
                    continue;
                }
                    max = nums[i];
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    arrayList.add(max);
                    for (int j = i + 1; j < nums.length; j++) {
                        max += nums[j];
                        arrayList.add(max);
                    }
                    arrayList1.add(arrayList.stream().max(Integer::compareTo).get());
                }

            Integer integer = arrayList1.stream().max(Integer::compareTo).orElse(0);
            System.out.println(integer);
            return integer;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}