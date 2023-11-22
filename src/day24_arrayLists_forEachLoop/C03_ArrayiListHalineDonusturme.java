package day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArrayiListHalineDonusturme {

    public static void main(String[] args) {

        Integer[] sayilarArray = {1,2,3,6,7,4,3,5};

        /*
            Bir array'i list haline getirmek icin
            en guvenilir yontem
            bir loop ile tum elementleri list'e kopyalamaktir

            Aslinda daha kisa bir yol vardir
            ama iki buyuk yanetkisi oldugundan
            bunlara dikkat etmek gerekir

            1- Olusturdugumuz Liste
               Arrays class'i ile olusturuldugundan
               ekleme/cikarma gibi listenin uzunlugunu degistirecek
               islemlere IZIN VERMEZ

            2- Array ve bu array'den olusturulan List
               birbiri ile bagimli kalir
               birinde sonradan yapilan degisiklikler
               otomatik olarak digerine de islenir

         */

        List<Integer> sayilarListesi = Arrays.asList(sayilarArray);

        System.out.println("Sayilar Listesi : " + sayilarListesi);
        // Sayilar Listesi : [1, 2, 3, 6, 7, 4, 3, 5]


        // sayilar listesine 9'u ekleyin

        // sayilarListesi.add(9); // UnsupportedOperationException

        // Listeden 7'yi silin

        Object silinecekElement = 7;

        // sayilarListesi.remove(silinecekElement) ; // UnsupportedOperationException


        System.out.println("Sayilar listesi : " + sayilarListesi);
        System.out.println("Sayilar array'i : " + Arrays.toString(sayilarArray));

        // array'in 2.index'indeki sayiyi 10 yapin
        sayilarArray[2] = 10;


        System.out.println("Array update sonrasi Sayilar listesi : " + sayilarListesi);
        System.out.println("Array update sonrasi Sayilar array'i : " + Arrays.toString(sayilarArray));



        List<Integer> fiyatList = new ArrayList<>();
        fiyatList.add(10);
        fiyatList.add(20);
        fiyatList.add(30);

        Integer[] kontrolArrayi = {10,20,30};

        // fiyat listesinin, kontrol listesi olarak verilen array ile ayni oldugunu test edin

        List<Integer> kontrolListesi = Arrays.asList(kontrolArrayi);

        if (fiyatList.equals(kontrolListesi)){
            System.out.println("test PASSED");
        }else{
            System.out.println("test FAILED");
        }

    }
}
