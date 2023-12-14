package day39_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_TryCatch {

    public static void main(String[] args) {
        // kullanicidan 2 tamsayi isteyin
        // birinci sayiyi ikinci sayiya bolup
        // sonucun tamsayi kismini yazdirin

        Scanner scanner = new Scanner(System.in);

        /*
            Iyi bir Coder
            yazdigi kodun neresinde, ne tur sorunlar olusabilecegini ongorup
            sorun olusabilecek durumlar icin
            Java'ya yapmasi gerekenleri tembihler.

            Eger ongorulen risk birden fazla ise
            bu riski tasiyan kodlar ayri ayri try-catch bloklari ile
            kontrol altina alinabilir

            AMA bu durumda ikisi ayri ayri oldugundan
            senkronize calismayabilir

         */
        int sayi1 = 0;
        int sayi2 = 1;

        try {

            System.out.println("Lutfen bolunecek tamsayiyi girin");

            sayi1 = scanner.nextInt();

            System.out.println("Lutfen bolecek tamsayiyi girin");

            sayi2 = scanner.nextInt();

        } catch (InputMismatchException e) {

            System.out.println("Tamsayi dedik TAMSAYI....");

        }


        try {

            System.out.println("ilk sayi / ikinci sayi = " + sayi1/sayi2);

        } catch (ArithmeticException e) {

            System.out.println("Bolecek sayi 0 OLAMAZ");
        }


    }
}
