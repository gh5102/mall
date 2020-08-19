package com.gh.common.ghcommon.sort;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 选择排序
 */
public class Test2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 11, 5, 12, 7, 8, 9, 10, 5};
        print(nums);
        System.out.println("排序1");
        sort1(nums);
        System.out.println("排序2");
        sort2(nums);
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
        int min = 0;
        for(int i=0;i<nums.length-1;i++){
            temp = nums[i];
            min = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<temp){
                    min = j;
                    temp = nums[j];
                }
            }
            //交换最小值
            nums[min] = nums[i];
            nums[i] = temp;
            print(nums);
        }
        print(nums);
    }

    /**
     * 优化
     * @param nums
     */
    public static void sort2(int[] nums){
        int minTemp = 0;
        int maxTemp = 0;
        int min = 0;
        int max = 0;
        for(int i=0;i<(nums.length)/2;i++){
            minTemp = nums[i];
            maxTemp = nums[nums.length-i-1];
            min = i;
            max = nums.length-i-1;
            for(int j=i+1;j<nums.length-i-1;j++){
                if(nums[j]<minTemp){
                    min = j;
                    minTemp = nums[j];
                }
                if(nums[j]>maxTemp){
                    max = j;
                    maxTemp = nums[j];
                }
            }
            //交换最小值
            nums[min] = nums[i];
            nums[i] = minTemp;
            //交换最大值
            nums[max] = nums[nums.length-i-1];
            nums[nums.length-i-1] = maxTemp;
            print(nums);
        }
        print(nums);
    }

    public static void print(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.printf("%d\t",nums[i]);
        }
        System.out.println();
    }
}
