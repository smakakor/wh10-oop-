package oop.Market;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Market {
    public static void main(String[] args) {
        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        randomFilling(queue1);
        randomFilling(queue2);
        add("Владимир",queue1,queue2);
        System.out.println("Первая очередь" + queue1);
        System.out.println("Вторая очередь" + queue2);
        System.out.println("Первая очередь" + queue1);
        System.out.println("Вторая очередь" + queue2);

        remove(queue1,queue2);
        System.out.println("Первая очередь" + queue1);
        System.out.println("Вторая очередь" + queue2);
    }

    private static final List<String> NAME = List.of(
            "Артём",
            "Лев",
            "Кирилл",
            "Юлия",
            "Александра",
            "Вера",
            "Ксения",
            "Полина",
            "Алиса"
    );
    private static final Random RANDOM = new Random();
    private static final int MAX_SIZE = 5;

    private static void randomFilling(Queue<String> queue) {
        int size = RANDOM.nextInt(MAX_SIZE + 1);
        for (int i = 0; i < size; i++) {
            queue.offer(NAME.get(RANDOM.nextInt(NAME.size())));
        }
    }
    private static void add (String name,
                             Queue<String> queue1,
                             Queue<String> queue2) {
        if (queue1.size() == MAX_SIZE && queue2.size() == MAX_SIZE ) {
            System.out.println("Зовем Галю");
            return;
        }
        if (queue1.size() < queue2.size() && queue1.size()!=MAX_SIZE) {
            queue1.offer(name);
        } else {
            queue2.offer(name);
        }
    }
    private static void remove (Queue<String> queue1,
                                Queue<String> queue2) {
        if (RANDOM.nextBoolean()) {
        queue1.poll();
        } else {
            queue2.poll();
        }
    }
}
