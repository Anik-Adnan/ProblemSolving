package BinarySearch;

/**
 * InfiniteArray
 */
public class InfiniteArray {

    public static void main(String[] args) {
        int[] arr = {-14, -7,-6, -3, 0, 2, 4,12,23,44,47,93,100};
        int target = 12;
        int ans = ans(arr, target);
        System.out.println(ans);
    }

    public static int ans(int[] arr,int target){
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (arr[end] < target) {
            start = end;
            end = end +(end - start +1 )* 2;
        }
        return search(arr, target, start, end);
    }

    public static int search(int[] nums, int target,int start,int end) { 
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}