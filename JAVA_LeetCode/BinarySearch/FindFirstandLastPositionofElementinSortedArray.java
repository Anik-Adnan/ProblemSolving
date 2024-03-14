package BinarySearch;

import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray{
    public static void main(String[] args){
        int[] arr = {5,7,7,8,8,8,8,10};
        int target = 8;
        int[] ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    public static int[]  searchRange(int[] nums, int target) {
        int leftIndex = searchLeft(nums, target);
        int rightIndex = searchRight(nums, target);

        if (leftIndex <= rightIndex) {
            return new int[]{leftIndex, rightIndex};
        } else {
            return new int[]{-1, -1};
        }
    }

    public static int searchLeft(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }

    public static int searchRight(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end;
    }
}