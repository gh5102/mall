package com.gh.common.ghcommon.stack;

public class Test1 {

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);
        arrayStack.push(6);

        arrayStack.list();

        System.out.println();
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());


    }
}

//栈
class ArrayStack{
    //栈大小
    private int maxSize;
    //模拟栈
    private int[] stack;
    //栈顶
    private int top = -1;

    public ArrayStack(int maxSize){
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    //栈满
    public boolean isFull(){
        return top == maxSize-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    //入栈
    public void push(int val){
        if(isFull()){
            System.out.println("栈满");
            return;
        }
        top++;
        stack[top] = val;
    }

    //出栈
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("栈空");
        }
        return stack[top--];
    }

    //遍历
    public void list(){
        if(isEmpty()){
            System.out.println("栈空");
            return;
        }
        for(int i = top;i>=0;i--){
            System.out.printf("stack[%d]:%d\t",i,stack[i]);
        }
    }
}

/**
 * 单链表实现栈
 */
class listStack{
    private int maxSize;
    private int top;
    private Node node;
}

class Node{

}
