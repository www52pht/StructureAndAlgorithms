package com.www.queue;

/**
 * @author www
 * @version 1.0
 * @create 2021/2/21 17:03
 */
public class MyCircularQueue {
    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(3); //设置长度是3

        System.out.println(circularQueue.enQueue(1));
        System.out.println(circularQueue.enQueue(2));
        System.out.println(circularQueue.enQueue(3));
        System.out.println(circularQueue.enQueue(4));
        System.out.println(circularQueue.Rear());

        System.out.println(circularQueue.isFull());
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.enQueue(4));
        System.out.println(circularQueue.Rear());
    }
    private int[] data;
    private int front, tail;

    public MyCircularQueue(int k) {
        data = new int[k + 1];
        front = 0;
        tail = 0;
    }

    //添加一个元素
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        } else {
            data[tail] = value;
            tail = (tail + 1) % data.length;
            return true;
        }
    }

    //删除对尾元素
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        } else {
            front = (front + 1) % data.length;
            return true;
        }
    }

    //获取对头元素
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return data[front];
    }

    //获取队尾元素
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return data[(tail - 1 + data.length) % data.length];
    }

    //判断队列是否为空
    public boolean isEmpty() {
        return front == tail;
    }

    //判断队列是否满
    public boolean isFull() {
        return (tail + 1) % data.length == front;
    }
}

