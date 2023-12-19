package day42_listIterators_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

    public static void main(String[] args) {
        // double ended queue demektir
        // yani eklemeler ve silmeler, bastan veya sondan olabilir
        // bas veya son tercihi size kalmis
        // hemen hemen her method'un first ve last tercih eden halleri vardir

        Deque<Integer> deque = new LinkedList<>();

        deque.add(5);
        deque.add(7);
        deque.add(3);

        System.out.println(deque); // [5, 7, 3]

        deque.addFirst(10);
        deque.addLast(11);

        System.out.println(deque); // [10, 5, 7, 3, 11]

        deque.offerFirst(6);
        deque.offerLast(4);

        System.out.println(deque); // [6, 10, 5, 7, 3, 11, 4]

        deque.removeLastOccurrence(5);
        // List'de bir sayi yazdigimizda onu index olarak kabul ediyordu
        // ama queue veya deque'de aradan index ile eleman silme olmadigindan
        // biz bir sayi yazdigimizda o sayiyi silinecek sayi olarak kabul eder

        System.out.println(deque); // [6, 10, 7, 3, 11, 4]


    }
}
