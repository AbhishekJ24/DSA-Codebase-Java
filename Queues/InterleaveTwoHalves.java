package Queues;

import java.util.*;

public class InterleaveTwoHalves {
    public static void interleaveTwoHalves(Queue<Integer> q) {
        Queue<Integer> first = new LinkedList<>();
        int half = q.size()/2;
        for(int i=0;i<half;i++){
            first.add(q.remove());
        }
        for(int i=0;i<half;i++){
            q.add(first.remove());
            q.add(q.remove());
        }
        System.out.println(q);

    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interleaveTwoHalves(q);
    }
}
