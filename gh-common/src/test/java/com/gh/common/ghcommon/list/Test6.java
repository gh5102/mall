package com.gh.common.ghcommon.list;

public class Test6 {
}

//创建一个双向链表的类
class doubleLinkedList{
    //先初始化一个头节点，头节点不动
    private HeroNode2 head = new HeroNode2(0,"","");

    //返回头节点
    public HeroNode2 getHead() {
        return head;
    }

    //添加节点到单向链表
    //不考虑编号顺序
    //找到当前链表的最后节点
    //将最后这个节点的next指向新的节点
    public void addNode(HeroNode2 heroNode){
        HeroNode2 temp = head;
        while (true){
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;
        heroNode.pre = temp;
    }

    public void addByOrder(HeroNode2 heroNode){
        HeroNode2 temp = head;
        boolean flag = false;
        while (true){
            if(temp.next == null)
                break;
            if(temp.next.no > heroNode.no){
                break;
            }else if (temp.next.no == heroNode.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            System.out.println("No已存在："+heroNode.no);
            return;
        }else{
            heroNode.next = temp.next;
            temp.next = heroNode;
            heroNode.pre = temp;
        }
    }

    public void update(HeroNode2 heroNode){
        if(head.next == null){
            System.out.println("链表为空");
            return;
        }

        //找到需要修改的节点
        //定义一个辅助变量
        HeroNode2 temp = head.next;
        boolean flag = false;
        while (true){
            if (temp != null){
                break;
            }
            if(temp.no == heroNode.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            temp.name = heroNode.name;
            temp.nickname = heroNode.nickname;
        }else {
            System.out.println("该No不存在："+heroNode.no);
        }
    }

    public void del(int no){
        if(head == null){
            System.out.println("链表为空");
            return;
        }
        HeroNode2 temp = head.next;
        boolean flag = false;
        while (true){
            if(temp == null){
                break;
            }
            if(temp.no == no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            temp.pre.next = temp.next;
            if(temp.next != null){
                temp.next.pre = temp.pre;
            }
        }else{
            System.out.println("该节点No不存在："+no);
        }
    }

    //显示链表
    public void list(){
        if(head.next == null){
            System.out.println("链表为空");
            return;
        }
        HeroNode2 temp = head.next;
        while (true){
            if(temp == null){
                break;
            }
            //输出节点信息
            System.out.println(temp);
            temp = temp.next;
        }
    }
}


/**
 * 节点
 */
class HeroNode2{
    public int no;
    public String name;
    public String nickname;
    public HeroNode2 next;
    public HeroNode2 pre;
    public HeroNode2(int no,String name,String nickname){
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return this.no+"-"+this.name+"-"+this.nickname;
    }
}

