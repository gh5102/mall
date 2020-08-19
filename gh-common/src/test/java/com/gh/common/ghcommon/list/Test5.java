package com.gh.common.ghcommon.list;

import java.util.Stack;

/**
 * 反向打印单链表
 */
public class Test5 {
    public static void main(String[] args) {
        HeroNode heroNode1 = new HeroNode(1,"刘邦","汉高祖");
        HeroNode heroNode2 = new HeroNode(2,"韩信","淮阴侯");
        HeroNode heroNode3 = new HeroNode(3,"张良","张良");
        HeroNode heroNode4 = new HeroNode(4,"萧何","丞相");
        HeroNode heroNode5 = new HeroNode(5,"项羽","西楚霸王");

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addByOrder(heroNode1);
        singleLinkedList.addByOrder(heroNode2);
        singleLinkedList.addByOrder(heroNode4);
        singleLinkedList.addByOrder(heroNode5);
        singleLinkedList.addByOrder(heroNode4);

        singleLinkedList.del(6);
        singleLinkedList.list();

        printReverseList(singleLinkedList.getHead());
    }
    //1\利用栈的数据结构，先进后出实现逆序打印

    public static void printReverseList(HeroNode heroNode){
        if(heroNode.getNext() == null){
            return;
        }
        Stack<HeroNode> stack = new Stack<>();
        HeroNode cur = heroNode.getNext();
        while (cur!=null){
            stack.add(cur);
            cur = cur.getNext();
        }
        System.out.println("反向输出");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
