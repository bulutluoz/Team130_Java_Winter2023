package day41_exceptions_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(7);
        sayilar.add(3);

        System.out.println(sayilar); // [5, 1, 7, 3]

        // Index kullanmadan listedeki sayilari 2'ser artirin

        for (Integer each: sayilar
             ) {
            each = each + 2;
            System.out.print(each +" ");
        }

        System.out.println("");

        System.out.println(sayilar); // [5, 1, 7, 3]

        // Java'da coklu obje bulunduran her yapi index'i desteklemez
        // Index olmadan da bazi islemleri yapabilmek icin
        // Java Iterator interface'ini olusturmustur.

        // Iterator kullanarak sayilar listesindeki tum sayilari toplayin

        Integer toplam = 0;

        Iterator iterator = sayilar.iterator();

        System.out.println(iterator.hasNext()); // true
        // yaninda eleman varsa true, yoksa false döndürür

        toplam += (Integer)iterator.next();
        // iterator'i yanindaki sayidan sonraya gecirir
        // ve gectigi sayiyi bize döndürür
        toplam += (Integer)iterator.next();

        toplam += (Integer)iterator.next();

        toplam += (Integer)iterator.next();

        System.out.println(toplam); // 16

        // iterator ile calisirken dikkat etmemiz gereken en onemli konu
        // iterator'i nerede biraktigimizdir.
        // bu soru icin dusunursek 51.satirda iterator en sona gitti
        // bir kere daha next() kullanirsak

        // System.out.println(iterator.next()); // NoSuchElementException


        // bu durumda iterator'a yeniden sifirdan baslayacak deger atamasi yapmak lazim
        iterator = sayilar.iterator();

        // listedeki tum sayilari iterator ile silin

        while (iterator.hasNext()){ // iterator'in yaninda eleman oldugu surece true doner
                                    // boylece while loop calismaya devam eder

            iterator.next();

            iterator.remove();

        }

        System.out.println(sayilar); // []
    }

}

















