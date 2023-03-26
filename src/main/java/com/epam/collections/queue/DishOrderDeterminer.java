package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list = new ArrayList<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }
        while (!queue.isEmpty()) {
            for (int i = 1; i < everyDishNumberToEat; i++)
                queue.addLast(queue.pollFirst());
            list.add(queue.pollFirst());
        }
        return list;
    }

    public static void main(String[] args) {
        DishOrderDeterminer dishOrderDeterminer = new DishOrderDeterminer();
        System.out.println(dishOrderDeterminer.determineDishOrder(10, 3));
    }
}
