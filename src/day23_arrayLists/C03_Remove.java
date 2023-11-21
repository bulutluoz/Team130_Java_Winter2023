package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);
        sayilar.add(0);

        System.out.println(sayilar); // [3, 5, 2, 0]

        /*
            remove 2 sekilde yapilabilir
            remove(index)
            remove(object)

            sayilar(0) eleman 0 mi yoksa index 0 mi ?

            Java'da hersey nettir
            eger listemiz Integer'lardan olusuyorsa
            Java parametre olarak yazdigimiz int sayiyi direk index kabul eder

            Eger element olarak herhangi bir sayiyi silmek isterseniz
            once bir Object olarak o sayiyi tanimlamali
            sonra silmelisiniz

         */

        System.out.println(sayilar.remove(1)); // 5
        // 1.index'deki sayiyi siler ve delil olarak sildigi elemani getirir

        System.out.println(sayilar); // [3, 2, 0]



        // eleman olarak varsa 8'i silmesini istiyorum

        Object silinecekEleman = 8 ;

        System.out.println(sayilar.remove(silinecekEleman)); // false

        System.out.println(sayilar); // [3, 2, 0]


        silinecekEleman = 3;

        System.out.println(sayilar.remove(silinecekEleman)); // true

        System.out.println(sayilar); // [2, 0]


    }
}
