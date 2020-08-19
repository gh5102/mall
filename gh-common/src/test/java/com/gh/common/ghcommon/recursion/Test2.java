package com.gh.common.ghcommon.recursion;

/**
 * 八皇后问题
 */
public class Test2 {
    //定义一个max表示共有多少个皇后
    int max = 8;
    //定义数组array,保存皇后放置位置的结果，比如 arr = {}
    int[] array = new int[max];

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.print();
    }

    private boolean judge(int n){
        for(int i=0;i<n;i++){
            //array[i]=array[n] 表示同一列
            //
            if(array[i] == array[n]){
                return false;
            }
        }
        return false;
    }

    private void print(){
        for (int i=0;i<array.length;i++){
            System.out.printf("%d\t",array[i]);
        }
        System.out.println();
    }
}
