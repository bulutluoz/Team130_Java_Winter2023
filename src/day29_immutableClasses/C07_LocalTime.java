package day29_immutableClasses;

import java.time.LocalTime;

public class C07_LocalTime {

    public static void main(String[] args) {

        LocalTime saat = LocalTime.now();

        System.out.println(saat); //  21:12:49.996407


        // bir for loop ile 1 milyon islem yaptirip
        // sureyi hesaplayalim


        LocalTime baslangic = LocalTime.now();
        long nanoBaslangic= baslangic.toNanoOfDay();

        int toplam = 0 ;

        for (int j = 1; j <10000 ; j++) {
            toplam = 0;
            for (int i = 1; i <=1000000 ; i++) {

                toplam += i % 10;
            }
        }

        System.out.println(toplam);

        LocalTime bitis = LocalTime.now();
        long nanoBitis= bitis.toNanoOfDay();

        System.out.println(baslangic);
        System.out.println(bitis);
        System.out.println("islem suresi = " +(nanoBitis - nanoBaslangic));

    }
}
