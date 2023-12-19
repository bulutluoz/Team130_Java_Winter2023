package day42_listIterators_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_ListIterator {

    public static void main(String[] args) {

        // ListIterator interface'i Iterator interface'inin child'idir.
        // dolayisiyla Iterator'a gore daha fazla method'a sahiptir

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(7);
        sayilar.add(3);

        System.out.println(sayilar); // [5, 1, 7, 3]

        // listedeki tum sayilari, index kullanmadan 2 artirin

        ListIterator lit = sayilar.listIterator();

        while (lit.hasNext()){


        Integer sayi = (Integer) lit.next(); // bir yana gecip, uzrinden gectigi elementi bize getirir

        lit.set(sayi + 2);
        }

        System.out.println(sayilar); // [7, 3, 9, 5]

        // iterator'da takip etmemiz gereken en onemli konu
        // iterator'i nerede biraktigimizdir
        // ornegin bu soruda iterator 34.satir itibariyle en sonda

        // listedeki elementleri, index kullanmadan
        // sondan basa dogru yazdirin

        while(lit.hasPrevious()){

            System.out.print(lit.previous() + " ");
        }
        System.out.println("");


        // index kullanmadan bir kere daha sondan basa tum elementleri yazdirin
        // su anda iterator en basta
        // tekrar sondan basa gelebilmesi icin
        // once iterator'i sona yollamaliyiz

        while (lit.hasNext()){
            lit.next();
        }

        // bu loop iterator'i sona goturur

        while (lit.hasPrevious()){

            System.out.print(lit.previous() + " ");
        }

        System.out.println("");

        // tum elementleri gozden gecirip
        // 5'den buyuk olanlari silin

        System.out.println(sayilar); // [7, 3, 9, 5]

        // ilk dusunecegimiz iterator nerede ?
        // iterator'in yerinden emin degilsek
        // yeniden deger atayabiliriz

        lit = sayilar.listIterator(); // iterator'i en basa koyar


        while (lit.hasNext()){

            if ((Integer)lit.next()>5){

                lit.remove();
            }
        }

        sayilar.set(1,-4);
        System.out.println(sayilar); // [3, -4]


        // listedeki sayilari kontrol edip
        // 0'dan buyuk olanlara 7 ekleyin

        lit = sayilar.listIterator();

        while(lit.hasNext()){

            Integer sayi = (Integer) lit.next();
            if (sayi>0){
                lit.set(sayi+7);
            }
        }

        System.out.println(sayilar); // [3, 12]
    }
}


















