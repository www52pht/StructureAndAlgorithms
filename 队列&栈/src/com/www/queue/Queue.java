package com.www.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * @author www
 * @version 1.0
 * @create 2021/2/21 15:27
 */
public class Queue {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enQueue(5);
        q.enQueue(3);
        q.enQueue(6);
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }

        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }

        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }


    }
}

class MyQueue {
    //存储元素
    private List<Integer> data;

    private int p_start;

    public MyQueue() {
        data = new ArrayList<>();
        p_start = 0;
    }

    public boolean enQueue(int x) {
        data.add(x);
        return true;
    }

    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        p_start++;
        return true;
    }

    //获取队列第一个元素
    public int Front() {
        return data.get(p_start);
    }

    //检查队列是否为空
    public boolean isEmpty() {
        return p_start >= data.size();
    }
}

