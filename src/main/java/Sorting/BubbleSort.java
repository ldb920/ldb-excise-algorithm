package Sorting;

/**
 * Created by ldb on 17/4/1.
 */
public class BubbleSort {
    public static void bubble(int[] nums){
        int tmp;
        int len = nums.length;
        int flag = 1;
        for(int i=0; i < len - 1 && 1 == flag; i++){
            flag = 0;
            for(int j = 0; j < len - 1 - i; j++){
                if(nums[j] > nums[j+1]){
                    tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                    flag = 1;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] nums = {5,4,3,2,1};

        for(int i =0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        bubble(nums);

        for(int i =0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }

}
