package day42_listIterators_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

    public static void main(String[] args) {

        /*
            Queue (kuyruk) yapisi geregi
            eklenenler otomatik olarak sona eklenir
            ve silinenler bastan silinir

         */

        Queue<Integer> queue = new LinkedList<>();

        queue.add(6);
        queue.add(9);
        queue.add(2);

        System.out.println(queue); // [6, 9, 2]

        queue.remove();
        System.out.println(queue); // [9, 2]

        System.out.println(queue.element()); // 9 en bastaki elementi silmeden bize getirir

        System.out.println(queue); // [9, 2]

        System.out.println(queue.peek()); // 9 en bastaki elementi silmeden bize getirir

        System.out.println(queue); // [9, 2]

        Queue<Integer> bosQueue = new LinkedList<>();

        // bosQueue.element(); // NoSuchElementException
        System.out.println(bosQueue.peek()); // null
        // ikisi ayni islevi yapar ama aralarindaki fark
        // bos queda biri exception firlatir, oteki null dondurur


        queue.offer(7);

        System.out.println(queue); // [9, 2, 7]

        // add ile ayni islevi yapar
        // aralarindaki fark, add her durumda ekler
        // ama offer kapasite sinirlamasi yoksa ekler

        System.out.println(queue.poll()); // 9 queue'nun basindaki elementi siler ve bize getirir

        System.out.println(queue); // [2, 7]

        // bosQueue.remove(); // NoSuchElementException
        System.out.println(bosQueue.poll()); // null

        System.out.println(queue.isEmpty()); // false



    }
}
