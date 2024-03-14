package BinarySearch;


public class SearchInsertPosition{
    public static void main(String[]  args){
        int at[]={1,3,5,7,8};
        int target = 6;
        System.out.println(searchInsert(at, target));
    }

    public static  int searchInsert(int[] nums, int target){
        int ceilNumIndex= BinarySearch(nums, target);
        return ceilNumIndex;
    }
    public static int BinarySearch(int[] nums,int target){
        int start= 0;
        int end = nums.length - 1;
        

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target < nums[mid]){
                end = mid-1;
            }else if( target > nums[mid]){
                start = mid +1;

            }
            else{
                return mid;
            }
        }
        return start;
    }
}