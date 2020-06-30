package chapter03.array;

import java.util.HashMap;

/**
 * 两数之和
 * https://leetcode-cn.com/problems/two-sum/
 *
 */
public class Solution_twoSum {


    public int[] twoSum(int[] nums,int target){
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int sum = target-nums[i];
            if (map.containsKey(nums[i])) {
                res[0] = map.get(nums[i]);
                res[1] = i;
            } else {
                map.put(sum,i);
            }

        }
        return res;

    }

}
