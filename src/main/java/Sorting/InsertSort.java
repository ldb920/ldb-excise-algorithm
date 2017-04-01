package Sorting;

/**
 * Created by ldb on 17/4/1.
 */
public class InsertSort {
    public static void inertSort(int[] nums){
        for(int i = 0; i < nums.length; i++){
            int tmp = nums[i];
            int point = i;
            for (int j = i; j > 0 && tmp < nums[j-1]; j--){
                nums[j] = nums[j-1];
                point = j-1;
            }
            nums[point] = tmp;
        }
    }

    public static void main(String[] args){
        int[] nums = {5,4,3,2,1};

        for(int i =0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        inertSort(nums);

        for(int i =0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }
}
