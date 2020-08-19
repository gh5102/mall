package com.gh.common.ghcommon.list;

/**
 * 单链表
 */
public class Test3 {

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
        int length = getLength(singleLinkedList.getHead());
        System.out.println("有效节点个数："+length);

        HeroNode heroNode =findLastIndexNode(singleLinkedList.getHead(),3);
        System.out.println(heroNode);

    }

    //查找单链表中的倒数第k个节点【新浪】
    //思路
    //1、编写一个方法，接收head节点，同时接收一个index
    //2\index 表示是倒数第index个节点
    //3、先把链表从头到尾遍历，得到链表的总长度getLength
    //4\得到size后，我们从链表的第一个开始遍历第（size-index）个

    public static HeroNode findLastIndexNode(HeroNode heroNode,int index){
        if(heroNode.getNext() == null){
            return null;
        }
        //第一次遍历得到链表长度
        int size = getLength(heroNode);
        //遍历到第size-index位置，就是倒数第k 个节点
        //先做index校验
        if(index<=0||index>size){
            return null;
        }
        //辅助变量
        HeroNode heroNode1 = heroNode.getNext();
        for(int i=0;i<size-index;i++){
            heroNode1 = heroNode1.getNext();
        }
        return heroNode1;
    }




    //:获取单链表的节点的个数（带头节点的需去掉）

    public static int getLength(HeroNode heroNode){
        if(heroNode.getNext() == null)
            return 0;
        int length = 0;
        HeroNode cur = heroNode.getNext();//去除头节点
        while (cur != null){
            length ++;
            cur = cur.getNext();
        }
        return length;
    }

}

/**
 * 节点
 */
class HeroNode{
    private int no;
    private String name;
    private String nickname;
    private HeroNode next;
    public HeroNode(int no,String name,String nickname){
        this.no = no;
        this.name = name;
        this.nickname = nickname;
        //this.next = next;
    }

    public HeroNode getNext(){
        return this.next;
    }
    public void setNext(HeroNode heroNode){
        this.next = heroNode;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return this.no+"-"+this.name+"-"+this.nickname;
    }
}

//定义SingleLinkedList 管理我们的链表
class SingleLinkedList{
    //先初始化一个头节点，头节点不动
    private HeroNode head = new HeroNode(0,"","");

    public HeroNode getHead() {
        return head;
    }

    //添加节点到单向链表
    //不考虑编号顺序
    //找到当前链表的最后节点
    //将最后这个节点的next指向新的节点
    public void addNode(HeroNode heroNode){
        HeroNode temp = head;
        while (true){
            if(temp.getNext() == null){
                break;
            }
            temp = temp.getNext();
        }
        temp.setNext(heroNode);
    }

    public void addByOrder(HeroNode heroNode){
        HeroNode temp = head;
        boolean flag = false;
        while (true){
            if(temp.getNext() == null)
                break;
            if(temp.getNext().getNo() > heroNode.getNo()){
                break;
            }else if (temp.getNext().getNo() == heroNode.getNo()){
                flag = true;
                break;
            }
            temp = temp.getNext();
        }
        if (flag){
            System.out.println("No已存在："+heroNode.getNo());
            return;
        }else{
            heroNode.setNext(temp.getNext());
            temp.setNext(heroNode);
        }
    }

    public void update(HeroNode heroNode){
        if(head.getNext() == null){
            System.out.println("链表为空");
            return;
        }

        //找到需要修改的节点
        //定义一个辅助变量
        HeroNode temp = head.getNext();
        boolean flag = false;
        while (true){
            if (temp != null){
                break;
            }
            if(temp.getNo() == heroNode.getNo()) {
                flag = true;
                break;
            }
            temp = temp.getNext();
        }
        if (flag){
            temp.setName(heroNode.getName());
            temp.setNickname(heroNode.getNickname());
        }else {
            System.out.println("该No不存在："+heroNode.getNo());
        }
    }

    public void del(int no){
        HeroNode temp = head;
        boolean flag = false;
        while (true){
            if(temp.getNext() == null){
                break;
            }
            if(temp.getNext().getNo() == no){
                flag = true;
                break;
            }
            temp = temp.getNext();
        }
        if(flag){
            temp.setNext(temp.getNext().getNext());
        }else{
            System.out.println("该节点No不存在："+no);
        }
    }

    //显示链表
    public void list(){
        if(head.getNext() == null){
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.getNext();
        while (true){
            if(temp == null){
                break;
            }
            //输出节点信息
            System.out.println(temp);
            temp = temp.getNext();
        }
    }
}