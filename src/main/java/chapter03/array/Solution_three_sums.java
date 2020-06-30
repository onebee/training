package chapter03.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 * https://leetcode-cn.com/problems/3sum/ (高频老题）
 */
public class Solution_three_sums {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length==0)return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {

            if (i> 0 && nums[i] == nums[i - 1]) continue;
            int target = -nums[i];
            int j = i+1;
            int k = nums.length-1;
            while (j < k) {
                if (nums[j] + nums[k] == target) {
                    List<Integer> cur = new ArrayList<>();
                    cur.add(nums[i]);
                    cur.add(nums[j]);
                    cur.add(nums[k]);
                    res.add(cur);

                    j++;
                    k--;
                    while (j< nums.length && nums[j]==nums[j-1])j++;
                    while (k>j && nums[k]==nums[k+1])k--;
                } else if (nums[j] + nums[k] > target) {
                    k--;
                }else{
                    j++;
                }


            }



        }
        return res;


    }
}
