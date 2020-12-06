package pers.cloud.FirstWeek;

import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i;
        int j;
        for (i=0,j=0; i < nums.length; i++) {
            if (i!=j){
                nums[j]=nums[i];
                nums[i]=0;
            }
            if (nums[j]!=0){
                j++;
            }
        }
    }
}
