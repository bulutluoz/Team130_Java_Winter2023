package day03_scanner_dataCasting;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        // Soru 7 (Interview)- Kullanicidan iki sayi alip
        //        ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ilk tamsayiyi giriniz");
        int ilkSayi = scanner.nextInt();

        System.out.println("Lutfen ikinci tamsayiyi giriniz");
        int ikinciSayi = scanner.nextInt();

        // diyelim ki ilkSayi = 10 ikinciSayi=20 girdi kullanici
        // ilkSayi'nin degerini 20, ikinciSayi'nin degerini 10 yapin

        int temp = 0;

        temp = ikinciSayi;


        ikinciSayi = ilkSayi;

        ilkSayi = temp;

        System.out.println("Girdiginiz variable'larin degerini degistirdim");
        System.out.println("Ilk sayinin yeni degeri : " + ilkSayi);
        System.out.println("Ikinci sayinin yeni degeri : " + ikinciSayi);
    }
}
