package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir double, bir de int sayi alip
        //        bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir tamsayi giriniz");

        int girilenTamsayi = scanner.nextInt();

        System.out.println("ondalikli bir sayi giriniz");

        double girilenOndalikliSayi = scanner.nextDouble();

        System.out.println("Girilen sayilarin toplami : " +(girilenTamsayi+girilenOndalikliSayi));

        System.out.println("Girilen ssayilarin carpimi : " +(girilenTamsayi*girilenOndalikliSayi));
    }
}
