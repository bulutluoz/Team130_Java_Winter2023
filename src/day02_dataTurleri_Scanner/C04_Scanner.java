package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        // kullanicidan ismini alip
        // buyuk harf olarak yazdirin

        // 1.adim : scanner objesi olusturmak

        Scanner scanner = new Scanner(System.in);

        // 2.adim : kullanicidan istediginiz bilgiyi,
        //          kullaniciya bilgi olarak konsolda yazdirin

        System.out.println("Lutfen isminizi giriniz");

        // 3.adim : istediginiz bilgiye uygun bir variable olusturun
        //          scanner objesi ve uygun next() ile bilgiyi kullanicidan alip
        //          olusturdugunuz variable'a atayin

        String girilenIsim = scanner.nextLine();
        // next() sadece 1 kelime alabilir, nextLine() butun girilen satiri alir


        System.out.println(girilenIsim.toUpperCase());



    }
}
