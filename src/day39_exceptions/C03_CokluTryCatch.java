package day39_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_CokluTryCatch {

    public static void main(String[] args) {
        // kullanicidan 2 tamsayi isteyin
        // birinci sayiyi ikinci sayiya bolup
        // sonucun tamsayi kismini yazdirin

        /*
            Birden fazla risk varsa, cozum olarak
            1- riskler ayri ayri try-catch icine alinabilir
            2- ic-ice try-catch kullanilabilir
            3- tek try birden fazla catch blogu olabilir
         */

        Scanner scanner = new Scanner(System.in);

        int sayi1 = 0;
        int sayi2 = 1;


        try {

            System.out.println("Lutfen bolunecek tamsayiyi girin");

            sayi1 = scanner.nextInt();

            System.out.println("Lutfen bolecek tamsayiyi girin");

            sayi2 = scanner.nextInt();

            System.out.println("ilk sayi / ikinci sayi = " + sayi1/sayi2);

        } catch (InputMismatchException e) {

            System.out.println("Tamsayi dedik TAMSAYI....");

        } catch (ArithmeticException e) {

            System.out.println("Bolecek sayi 0 OLAMAZ");

        }catch (Exception e) { // ongoremedigimiz baska bir exception olusursa

            System.out.println("Girilen degerler uygun degil");

        }



    }
}
