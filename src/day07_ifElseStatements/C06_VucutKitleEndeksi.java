package day07_ifElseStatements;

import java.util.Scanner;

public class C06_VucutKitleEndeksi {
    public static void main(String[] args) {

        // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        //         vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        //         vucut kitle endeksi 30’dan buyukse obez,
        //         25-30 arasi ise kilolu,
        //         20-25 arasi ise normal,
        //         20’den kucukse zayif yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kilnuzu kg olarak girin");
        double kilo = scanner.nextDouble();

        System.out.println("Lutfen boyunuzu cm olarak giriniz");
        double boy = scanner.nextDouble();


        double vke = (kilo*10000 / (boy *boy));

        System.out.println("Vucut kitle endeksiniz : " + vke);

        if (vke > 50 || vke < 10){
            System.out.println("Degerleri yanlis girdiniz");
        } else if (vke >=30) {
            System.out.println("Obezsiniz");
        } else if (vke>=25) {
            System.out.println("Kilolusunuz");
        } else if (vke>= 20) {
            System.out.println("Tebrikler, normalsiniz");
        }else {
            System.out.println("Zayifsiniz");
        }

    }
}
