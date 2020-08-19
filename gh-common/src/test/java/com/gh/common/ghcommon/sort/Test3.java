package com.gh.common.ghcommon.sort;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 插入排序
 */
public class Test3 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 11, 5, 12, 7, 8, 9, 10, 5};
        print(nums);
        sort1(nums);
        test();
    }

    public static void test(){
        Random ran = new Random();
        int[] arr = new int[80000];
        for (int i = 0;i<80000;i++){
            arr[i] = ran.nextInt(1000000);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日-hh时mm分ss秒");
        Date start = new Date();
        System.out.println(simpleDateFormat.format(start));
        sort1(arr);
        Date end = new Date();
        System.out.println(simpleDateFormat.format(end));
    }

    /**
     *
     * @param nums
     */
    public static void sort1(int[] nums){
        int temp = 0;
        int index = 0;
        for(int i=1;i<nums.length;i++){
            temp = nums[i];
            index = i-1;
            while (index>=0){
                if(nums[index]<temp) {
                    nums[index+1] = temp;
                    break;
                }
                else {
                    nums[index+1] = nums[index];
                }
                index--;
            }
            //print(nums);
        }
    }

    public static void print(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.printf("%d\t",nums[i]);
        }
        System.out.println();
    }
}
