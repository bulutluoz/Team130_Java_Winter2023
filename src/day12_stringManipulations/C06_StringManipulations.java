package day12_stringManipulations;

import java.util.Scanner;

public class C06_StringManipulations {
    public static void main(String[] args) {
        //Soru 4 : Kullanicidan bir sifre isteyip,
        //         asagidaki sartlari kontrol edin
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //         	- ilk harf kucuk harf olmali
        //         	- son karakter rakam olmali
        //         	- sifre bosluk icermemeli
        //         	- uzunlugu en az 10 karakter olmali


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String sifre = scanner.nextLine();

        int flag = 10;


        //         	- ilk harf kucuk harf olmali
        char ilkHarf = sifre.charAt(0);
        if (!(ilkHarf>='a' && ilkHarf<='z')){
            System.out.println("Ilk karakter kucuk harf olmali");
            flag++;
        }

        //         	- son karakter rakam olmali
        char sonKarakter = sifre.charAt(sifre.length()-1);

        if (!(sonKarakter>='0' && sonKarakter<='9')){
            System.out.println("Son karakter rakam olmali");
            flag++;
        }


        //         	- sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            flag++;
        }


        //         	- uzunlugu en az 10 karakter olmali

        if (sifre.length() < 10){
            System.out.println("Uzunluk en az 10 karakter olmalidir");
            flag++;
        }

        if (flag == 10){
            System.out.println("sifre basariyla kaydedildi");
        }


    }
}
