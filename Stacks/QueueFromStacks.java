package Stacks;

import java.util.ArrayList;

public class QueueFromStacks {
    ArrayList<Integer> queue;

    public QueueFromStacks() {
        queue = new ArrayList<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        int front = queue.get(0);
        queue.remove(0);
        return front;
    }

    public int peek() {
        return queue.get(0);
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
