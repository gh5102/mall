package com.gh.common.ghcommon.list;

/**
 * 棋盘-五子棋
 * 稀疏数组
 */
public class Test1 {
    public static void main(String[] args) {
        //创建原生二维数组
        //0表示空，1表示黑子，2表示白子
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        //输出原始二维数组
        for (int[] row:chessArr1){
            for (int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        //二维数组转 稀疏数组
        //1、先遍历二维数组，得到棋子个数
        int sum = 0;
        for (int[] row:chessArr1){
            for (int data:row){
                if(data != 0){
                    sum++;
                }
            }
        }
        //2\创建稀疏数组-->保存文件
        int sparseArr[][] = new int[sum+1][3];
        //给稀疏数组赋值
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;
        int count = 0;
        for (int i = 0;i<11;i++){
            for (int j=0;j<11;j++){
                if(chessArr1[i][j] != 0){
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr1[i][j];
                }
            }
        }
        System.out.println("稀疏数组：");
        for (int i =0;i<sparseArr.length;i++){
            System.out.printf("%d\t%d\t%d\t",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
            System.out.println();
        }
        //稀疏数组-->恢复二维数组
        int chessArr2[][] = new int[sparseArr[0][0]][sparseArr[0][1]];
        for(int i=0;i<sparseArr[0][2];i++){
            chessArr1[sparseArr[i+1][0]][sparseArr[i+1][1]] = sparseArr[i+1][2];
        }
        System.out.println("还原二维数组：");
        for (int[] row:chessArr1){
            for (int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }
}
