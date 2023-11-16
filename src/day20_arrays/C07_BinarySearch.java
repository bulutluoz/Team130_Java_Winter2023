package day20_arrays;

import day19_arrays.C04_KullanimAdediniBulma;

import java.util.Arrays;

public class C07_BinarySearch {

    public static void main(String[] args) {

        String[] harfler = {"a","c","r","s","a","a","s","k","a"};

        // verilen harfler array'inde "k" harfinin olup olmadigini yazdirin

        C04_KullanimAdediniBulma.elemanArama(harfler,"k");
        // Istenen eleman k, array'de 1 kere kullanilmis

        // "A" var mi ?

        C04_KullanimAdediniBulma.elemanArama(harfler,"A");
        // Istenen eleman A harfi array'de yok


        int[] arr = {3,9,1,17,5,2,20};
        // verilen arr'de 2 var mi ?

        System.out.println(Arrays.binarySearch(arr, 2)); // -1
        System.out.println(Arrays.binarySearch(arr, 20)); // 6
        System.out.println(Arrays.binarySearch(arr, 1)); // -1
        System.out.println(Arrays.binarySearch(arr, 17)); // 3
        System.out.println(Arrays.binarySearch(arr, 3)); // 0
        System.out.println(Arrays.binarySearch(arr, 5)); // -2
        System.out.println(Arrays.binarySearch(arr, 9)); // 1

        // BinarySearch, binaryTree ozelligini kullandigindan
        // arama isleminden once sort islemi YAPILMALIDIR
        // sort islemi yapilmadan binarySearch kullanilirsa
        // sonuc ONGORULEMEZ, dogru da olabilir yanlis da olabilir

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 5, 9, 17, 20]
        System.out.println(Arrays.binarySearch(arr, 2)); // 1
        System.out.println(Arrays.binarySearch(arr, 20)); // 6
        System.out.println(Arrays.binarySearch(arr, 1)); // 0
        System.out.println(Arrays.binarySearch(arr, 17)); // 5
        System.out.println(Arrays.binarySearch(arr, 3)); // 2
        System.out.println(Arrays.binarySearch(arr, 5)); // 3
        System.out.println(Arrays.binarySearch(arr, 9)); // 4


        // [1, 2, 3, 5, 9, 17, 20]

        System.out.println(Arrays.binarySearch(arr, -3)); // -1
        System.out.println(Arrays.binarySearch(arr, 0)); // -1
        System.out.println(Arrays.binarySearch(arr, 4)); // -4
        System.out.println(Arrays.binarySearch(arr, 6)); // -5
        System.out.println(Arrays.binarySearch(arr, 18)); // -7
        System.out.println(Arrays.binarySearch(arr, 50)); // -8
        System.out.println(Arrays.binarySearch(arr, 100)); // -8
        System.out.println(Arrays.binarySearch(arr, 44)); // -8

        // olmayan sayilarda OLMADIGINI belirtmek icin - kullanilir
        // -0 anlamsiz olacagindan
        // olmayan elementlerin yerlerini SIRA olarak verir
    }
}
