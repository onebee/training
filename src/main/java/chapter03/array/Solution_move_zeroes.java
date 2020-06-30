package chapter03.array;

/**
 * https://leetcode-cn.com/problems/move-zeroes/
 * 移动零
 */
public class Solution_move_zeroes {

    public void moveZeroes(int[] nums){
        int j =0;
        for(int i=0;i<nums.length;i++){
            if (nums[i] != 0){

                nums[j]= nums[i];
                if(i!=j){
                    nums[i]=0;
                }
                j++;
            }
        }

    }

}
