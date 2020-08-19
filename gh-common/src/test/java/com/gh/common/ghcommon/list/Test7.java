package com.gh.common.ghcommon.list;

/**
 * 约瑟夫问题
 * 约瑟夫问题是个有名的问题：N个人围成一圈，从第一个开始报数，第M个将被杀掉，最后剩下一个，其余人都将被杀掉。例如N=6，M=5，被杀掉的顺序是：5，4，6，2，3。
 * 分析：
 * （1）由于对于每个人只有死和活两种状态，因此可以用布尔型数组标记每个人的状态，可用true表示死，false表示活。
 * （2）开始时每个人都是活的，所以数组初值全部赋为false。
 * （3）模拟杀人过程，直到所有人都被杀死为止。
 */
public class Test7 {


    public static void main(String[] args) {
        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
        circleSingleLinkedList.addBoy(22);
        circleSingleLinkedList.showBoy();
        System.out.println();
        circleSingleLinkedList.outShow(4);
    }

}

class CircleSingleLinkedList{
    //创建一个first节点，当前没有编号
    private Boy first = new Boy(-1);
    public void addBoy(int nums){
        if(nums < 1){
            System.out.println("nums应大于1");
            return;
        }
        Boy curBoy = new Boy(-1);
        for (int i=1;i<=nums;i++){
            Boy boy = new Boy(i);
            if(i==1){
                curBoy.next = boy;
                first.next = boy;
                boy.next = boy;
            }else{
                curBoy.next.next = boy;
                boy.next = first.next;
                curBoy.next = boy;
            }
        }

    }

    public void showBoy(){
        //判断链表是否为空
        if(first == null){
            System.out.println("空");
            return;
        }
        //辅助指针遍历输出
        Boy curBoy = first.next;
        while (true){
            System.out.printf("编号%d\t",curBoy.no);
            if(curBoy.next.no < curBoy.no)
                break;
            curBoy = curBoy.next;
        }
    }

    public void outShow(int k){
        Boy cur = new Boy(-1);
        cur.next = first.next.next;
        int t = 1;
        while (true){
            t++;
            if(first.next.no == cur.next.no){
                System.out.printf("编号%d\t",cur.next.no);
                break;
            }
            if(t%k !=0) {
                first.next = cur.next;
                cur.next = cur.next.next;
            } else{
                System.out.printf("编号%d\t",cur.next.no);
                first.next.next = cur.next.next;
                cur.next = cur.next.next;
            }

        }

    }
}

class Boy{
    public int no;
    public Boy next;
    public Boy(int no){
        this.no = no;
    }
}