package day29_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C03_Mutable_ImmutableClasses {

    public static void main(String[] args) {

        /*
            String class'i IMMUTABLE oldugu icin
            method ile yapilan degisiklikler kalici degisiklik yapmaz
            sadece o satir icin degisikligi uygular

            Ancakkkk
            ArrayList MUTABLE oldugundan
            method ile yapilan degisiklikler KALICI olur
         */

        String isim = "Ramazan";

        isim.toUpperCase();

        System.out.println(isim.replace("a", "i")); // Rimizin

        isim.concat(" Tatar");

        System.out.println(isim); // Ramazan



        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.remove(1);
        sayilar.set(1,40);

        System.out.println(sayilar); // [10, 40]
    }
}
