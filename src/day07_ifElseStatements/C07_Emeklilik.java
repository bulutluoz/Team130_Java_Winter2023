package day07_ifElseStatements;

import java.util.Scanner;

public class C07_Emeklilik {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //        veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz E:Erkek, K:Kadin");

        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");

        int yas = scanner.nextInt();

        if (cinsiyet == 'E' && yas>=65){
            System.out.println("65 yas uzeri erkek emekli olabilir");
        } else if (cinsiyet == 'E' && yas<65) {
            System.out.println("Emekli olmak icin " + (65-yas) + " yil daha calisman gerekir");
        } else if (cinsiyet == 'K' && yas>=60) {
            System.out.println("60 yas uzeri kadin emekli olabilir");
        } else if (cinsiyet=='K' && yas <60) {
            System.out.println("Emekli olmak icin " + (60-yas) + " yil daha calisman gerekir");

        }else {
            System.out.println("hatali giris");
        }
    }
}
