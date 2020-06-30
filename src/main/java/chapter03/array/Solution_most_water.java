package chapter03.array;

/**
 * 盛水最多的容器
 * https://leetcode-cn.com/problems/container-with-most-water/
 */
public class Solution_most_water {
    public int maxArea(int[] a) {
        int maxArea = 0;
        for (int i = 0, j = a.length - 1; i < j; ) {
            int minHeight = a[i] < a[j] ? a[i++] : a[j--];
            int area = (j + 1 - i) * minHeight;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

}
