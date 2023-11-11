package day15_methodOlusturma;

import day16_methodOlusturma_methodOverloading.C01_voidMethodOlusturma;

public class Runner {

    public static void main(String[] args) {


        C02_AsalSayiMethodu.asalsayiMi(61); // asal
        C02_AsalSayiMethodu.asalsayiMi(83); // asal

        System.out.println(C03_TamBolenlerSayisi.pozitifTamBolenSayisi(234564)); // 24

        System.out.println(C03_TamBolenlerSayisi.pozitifTamBolenSayisi(61)); // 2

        C01_voidMethodOlusturma.kisiBilgileriYazdir("sahil","baylarli","8901234567876543");
    }
}
