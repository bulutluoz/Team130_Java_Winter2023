package day13_forLoop;

import java.util.Scanner;

public class C08_ForLoopFaktoryel {

    public static void main(String[] args) {

        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip,
        //        bu sayinin faktoryel degerini hesaplayin.
        //        Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //	      Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk bir pozitif tamsayi giriniz");
        int sayi = scanner.nextInt();

        long faktoryel = 1 ;

        for (int i = sayi; i >=1 ; i--) {

            faktoryel *= i;
        }


    }
}
