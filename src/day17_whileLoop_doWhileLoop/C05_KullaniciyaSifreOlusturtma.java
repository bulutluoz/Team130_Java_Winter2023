package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C05_KullaniciyaSifreOlusturtma {

    public static void main(String[] args) {

        // Kullanicidan sifre isteyin
        // asagidaki sartlari saglamayan sifrelerde hatalari yazdirip,
        // kullanicinin yeni sifre girmesi isteyin
        // Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin
        // gecerli sifre yazilinca “sifreniz basari ile kaydedildi” yazdirin
        // sartlar :
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali


        Scanner scanner = new Scanner(System.in);
        int flag = 7; // while loop'un calismaya baslayip
                      // kullanicidan deger alabilmemiz icin
                      // 0 disinda bir deger girdik
        String sifre = "";

        while (flag > 0){

            flag = 0;

            System.out.println("Lutfen bir sifre giriniz");
            sifre = scanner.nextLine();

            // - ilk harf kucuk harf olmali
            char ilkHarf = sifre.charAt(0);

            if ( !(ilkHarf>='a' && ilkHarf<='z')){
                System.out.println("ilk harf kucuk harf olmali");
                flag++;
            }


            // - son karakter rakam olmali

            char sonKarakter = sifre.charAt(sifre.length()-1);

            if (!(sonKarakter>='0' && sonKarakter<='9')){
                System.out.println("son karakter rakam olmali");
                flag++;
            }


            // - sifre bosluk icermemeli

            if (sifre.contains(" ")){
                System.out.println("sifre bosluk icermemeli");
                flag++;
            }

            // - uzunlugu en az 10 karakter olmali

            if (sifre.length()<10){
                System.out.println("uzunlugu en az 10 karakter olmali");
                flag++;
            }

        }
        System.out.println("sifreniz basari ile kaydedildi");

    }
}
