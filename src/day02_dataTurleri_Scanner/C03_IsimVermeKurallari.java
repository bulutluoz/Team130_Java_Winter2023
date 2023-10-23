package day02_dataTurleri_Scanner;

public class C03_IsimVermeKurallari {

    public static void main(String[] args) {

        int NOT = 23;
        int not = 54;
        int Not = 45;
        int noT = 65;

        // variable isimler case sensitive (buyuk-kucuk harf duyarlidir)

        System.out.println(NOT); // 23
        System.out.println(Not); // 45

        int abc3 = 45;

        // camelCase

        int karneNotu = 65;
        String isminIlkHarfi = "A";

        // String ISMINILKHARFI = "k";
        /*
            Eger variable ismi birden fazla kelimeden olusuyorsa
            ilk harf kucuk,
            sonraki kelimeler ise ilk harf buyuk, diger harfler kucuk yazilir

            buna camelCase denir

            farkli sekilde yazinca da Java kabul eder
            ama tum yazilimcilar tarafindan ortak olarak belirlenen
            kullanim kurallarina uymak
            bizim tecrubemizi gosterir
         */

        int benimAdimCemil = 33;
        int agirlik = 5;

    }
}
