package day42_listIterators_Collections;

import java.util.LinkedList;
import java.util.List;

public class C02_List {

    public static void main(String[] args) {

        List<Integer> sayilar = new LinkedList<>();

        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(10);

        System.out.println(sayilar); // [5, 7, 10]

        sayilar.add(2,44);

        System.out.println(sayilar); // [5, 7, 44, 10]

        // sayilar.remove(5); // IndexOutOfBoundsException


        List<Integer> digerList = new LinkedList<>();

        digerList.add(44);
        digerList.add(23);
        digerList.add(10);

        System.out.println(digerList); // [44, 23, 10]

        sayilar.retainAll(digerList); // sayilar listesinden diger listede olmayan elementleri siler

        System.out.println(sayilar);  // [44, 10]

        System.out.println(sayilar.hashCode()); // 2335




    }
}
