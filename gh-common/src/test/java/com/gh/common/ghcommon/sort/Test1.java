package com.gh.common.ghcommon.sort;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 11, 5, 12, 7, 8, 9, 10, 5};
        print(nums);
        sort1(nums);


        //给80000个数据
       /* Random ran = new Random();
        int[] arr = new int[80000];
        for (int i = 0;i<80000;i++){
            arr[i] = ran.nextInt(1000000);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日-hh时mm分ss秒");
        Date start = new Date();
        System.out.println(simpleDateFormat.format(start));
        sort1(arr);
        Date end = new Date();
        System.out.println(simpleDateFormat.format(end));*/
        //print(arr);
    }

    /**
     * 冒泡排序
     * 1\相邻元素作比较，前>后-->交换
     */
    public static void sort1(int[] nums){
        //需比较数组长度
        int k = nums.length;
        //临时变量，做替换
        int temp = 0;
        //交换标志
        boolean flag = false;
        for(int j=0;j<nums.length-1;j++) {
            for (int i = 0; i < k-1;i++) {
                if (nums[i] > nums[i + 1]) {
                    //System.out.printf("%d%d\t\n",nums[i],nums[i+1]);
                    flag = true;
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
            if(flag){
                flag = false;
            }else {
                break;
            }
            print(nums);
            k--;
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
