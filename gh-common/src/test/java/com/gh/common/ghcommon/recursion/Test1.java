package com.gh.common.ghcommon.recursion;

/**
 * 迷宫问题
 * 找最短路径
 */
public class Test1 {

    public static void main(String[] args) {
        //二维数组模拟迷宫
        //地图
        int[][] map = new int[8][7];
        //1表示墙
        //上下置为一
        //左右置为一
        for(int i=0;i<7;i++){
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for(int i=0;i<8;i++){
            map[i][0] = 1;
            map[i][6] = 1;
        }
        //设置挡板
        map[3][1] = 1;
        map[3][2] = 1;
        //输出地图
        for (int i=0;i<8;i++){
            for (int j=0;j<7;j++){
                System.out.printf("%d\t",map[i][j]);
            }
            System.out.println();
        }

        //递归找路
        getWay(map,1,1);
        System.out.println("---走过地图---");
        //输出地图
        for (int i=0;i<8;i++){
            for (int j=0;j<7;j++){
                System.out.printf("%d\t",map[i][j]);
            }
            System.out.println();
        }
    }

    /**
     *
     * @param map 地图
     * @param i 出发位置
     * @param j
     * @return 返回结果点
     * 当map[i][j] 0表示为走过，1表示墙，2表示通路可以走，3表示已走过不通
     * 策略 下-
     * 【6】【5】结束点
     */
    public static boolean getWay(int[][] map,int i,int j){

        if(map[1][2]== 2){
            System.out.println("game over");
            return true;
        }else{
            System.out.printf("[%d][%d]\t",i,j);

            if(map[i][j]==0){
                //下-右-上-左
                map[i][j] = 2;
                //向下走
                if(getWay(map,i+1,j)){
                    return true;
                }else if (getWay(map,i,j+1)){
                    return true;
                }else if(getWay(map,i-1,j)){
                    return true;
                }else if(getWay(map,i,j-1)){
                    return true;
                }else {
                    //说明该点死路
                    map[i][j] = 3;
                    System.out.println("死路：["+i+"],["+j+"]");
                    return false;
                }
            }else {
                System.out.println("死路：["+i+"],["+j+"]");
                return false;
            }
        }
       // return false;
    }

}
