package Sorting;

/**
 * Created by ldb on 17/4/1.
 */
public class ShellSort {

    public static void shellSort(int[] nums){
        int j = 0;
        int tmp = 0;

        for(int increment =  nums.length/2; increment > 0; increment = increment/2){
            for (int i = increment; i < nums.length; i++){
                tmp = nums[i];
                for(j = i; j >= increment; j = j - increment){
                    if(tmp < nums[j - increment])
                    {
                        nums[j] = nums[j - increment];
                    }else{
                        //这个必须
                        break;
                    }
                }
                nums[j] = tmp;
            }
        }
    }

    public static void main(String[] args){
        int[] nums = {5,4,3,2,1};

        for(int i =0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        shellSort(nums);

        for(int i =0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }

}
