package day09_switchStatements;

import java.util.Scanner;

public class C03_HaftaIciGunleriYazdirma {

    public static void main(String[] args) {

        // Kullanicidan gun ismini isteyin
        // girilen gunun hafta ici veya hafta sonu oldugunu yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
        String gunIsmi = scanner.next().toLowerCase();

        switch (gunIsmi){

            case "pazartesi" :
            case "sali" :
            case "carsamba" :
            case "persembe" :
            case "cuma" :
                System.out.println("hafta ici");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("Gun ismi yanlis");
        }
    }
}
