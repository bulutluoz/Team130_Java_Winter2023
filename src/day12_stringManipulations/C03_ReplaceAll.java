package day12_stringManipulations;

import java.util.Scanner;

public class C03_ReplaceAll {

    public static void main(String[] args) {

        // Kullanicidan bir metin isteyin
        // kullanicinin girdigi metinden space disindaki tum karakterleri
        // ve sayilari silip, metni yeni haliyle yazdirin

        // input : "J1*a34_va+12 C87an.90d654ir," output : Java Candir


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen metni giriniz");
        String metin = scanner.nextLine();


        // once sayilardan kurtulalim
        metin = metin.replaceAll("\\d","");

        // space'i koruma altina almak icin herhangi bir rakamla replace yapalim
        metin = metin.replaceAll("\\s","5");

        // ozel karakterlerden kurtulalim
        metin = metin.replaceAll("\\W","");


        // _'yi yok edelim, sayi koydugumuz space'i geri getirelim

        metin = metin.replace("_","").replaceAll("5"," ");

        System.out.println(metin);
    }
}
