package day06_ifElseStatements;

import java.util.Scanner;

public class C08_IfElseSusluParantezKullanimi {

    public static void main(String[] args) {

        // kullanicidan 2 tamsayi alin;
        // eger sayi1, sayi2'den buyukse sayi1'i 1 azaltin
        // sayi1, sayi2'den buyuk degilse sayi1'i 3 ile carpin, sayi2'yi 2 ile carpin
        // sayi1 ve sayi2'nin son degerlerini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi giriniz");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        /*
            eger if ve else'den sonra { } kullanmazsak
            Java if body ve else body olarak ilk ;'e kadar olan kismi alir

            Eger if ve else body'leri TEK BIR SATIR'dan olusuyorsa {} kullanmasak da olur
            AMMA if body'sinde veya else body'sinde bir satirdan fazla kod varsa
            MUTLAKA {} kullanmaliyiz
         */

        if (sayi1 > sayi2) sayi1--;
        else sayi1 *=3;
            sayi2 *=2;


        System.out.println("Sayi1 : " + sayi1 + ", Sayi2 : " + sayi2);


    }
}
