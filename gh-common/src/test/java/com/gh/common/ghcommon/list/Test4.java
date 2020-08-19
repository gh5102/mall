package com.gh.common.ghcommon.list;

/**
 * 单链表的反转
 */
public class Test4 {
    public static void main(String[] args) {

    }
    //思路
    //1、先定义一个节点reverseHead = new HeroNode();
    //2、从头到尾遍历原来的链表，每遍历一个节点，就将其取出，放在新的链表里reverseHead的最前端
    //3、原来的链表

    public static void getReverList(HeroNode heroNode){
        if(heroNode == null||heroNode.getNext() == null){
            return;
        }
        //当前节点
        HeroNode cur = heroNode.getNext();
        //暂存节点
        HeroNode next = null;
        //反转节点
        HeroNode reverseNode = new HeroNode(0,"","");
        //遍历原来的链表
        while (cur!=null){
            //保存当前节点的下一个节点
            next = cur.getNext();
            //将cur的下一个节点指向新的链表的最前端
            cur.setNext(reverseNode.getNext());
            reverseNode.setNext(cur);
            cur = next;
        }
        //将head.next 指向reverseHead.next
        heroNode.setNext(reverseNode.getNext());
    }
}
