package Sorting;

/**
 * Created by ldb on 17/4/1.
 */
public class QuickSort {
    public static int getMiddle(int[] nums, int low, int high){
        int tmp = nums[low];
        while(low < high){
            while(low < high && nums[high] > tmp){
                high--;
            }

            nums[low] = nums[high];

            while(low < high && nums[low] < tmp){
                low++;
            }

            nums[high] = nums[low];
        }
        nums[low] = tmp;
        return low;
    }

    public static void quick(int[] nums, int low, int high){
        if(low < high){
            int mid = getMiddle(nums, low, high);
            quick(nums, low, mid - 1);
            quick(nums, mid+1, high);
        }
    }

    public static void main(String[] args){
        int[] nums = {5,4,3,2,1};

        for(int i =0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        quick(nums, 0, 4);

        for(int i =0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
