package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        while (!firstQueue.isEmpty()){
            firstFor(firstQueue, arrayDeque);
            secondFor(secondQueue, arrayDeque);
        }
        return arrayDeque;
    }

    public void firstFor(Queue<Integer> firstQueue,ArrayDeque<Integer> arrayDeque){
        if (!arrayDeque.isEmpty())
            firstQueue.add(arrayDeque.pollLast());
        for (int i = 0; i < 2; i++)
            arrayDeque.addLast(firstQueue.poll());
    }

    public void secondFor(Queue<Integer> secondQueue, ArrayDeque<Integer> arrayDeque){
        if (arrayDeque.size() != 2)
            secondQueue.add(arrayDeque.pollLast());
        for (int i = 0; i < 2; i++)
            arrayDeque.addLast(secondQueue.poll());
    }
}
