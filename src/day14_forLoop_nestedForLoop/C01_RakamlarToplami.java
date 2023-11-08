package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class C01_RakamlarToplami {

    public static void main(String[] args) {

        //Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfemn pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();


        // once bana basamak sayisi lazim
        int basSayisi = (sayi+"").length();
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int girilenSayi = sayi;

        for (int i = 0; i <basSayisi ; i++) {

            birlerBasamagi = girilenSayi%10;
            rakamlarToplami += birlerBasamagi;
            girilenSayi /= 10 ;

        }

        System.out.println("Girilen "+ sayi + " sayisinin rakamlar toplami : " + rakamlarToplami);
    }
}
