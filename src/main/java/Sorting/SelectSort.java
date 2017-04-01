package Sorting;

/**
 * Created by ldb on 17/4/1.
 */
public class SelectSort {
    public static void select(int[] nums){
        for(int i = 0; i< nums.length; i++){
            int pointer = i;
            for(int j = nums.length - 1; j > i; j--){
                if(nums[j] < nums[pointer]){
                    pointer = j;
                }
            }
            int tmp = nums[i];
            nums[i] = nums[pointer];
            nums[pointer] = tmp;
        }
    }

    public static void main(String[] args){
        int[] nums = {5,4,3,2,1};

        for(int i =0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        select(nums);

        for(int i =0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
