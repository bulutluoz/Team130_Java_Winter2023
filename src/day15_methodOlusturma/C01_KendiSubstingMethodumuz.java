package day15_methodOlusturma;

import java.util.Scanner;

public class C01_KendiSubstingMethodumuz {

    public static void main(String[] args) {

        /*
            verilen bir string ve baslangic ve bitis index'leri icin
            asagidaki gorevi tamamlayin

            1- baslangic index'i bitis index'inden buyukse hata yazdirin
            2- baslangic ve/veya bitis index'i verilen string'in disinda ise hata yazdirin
            3- index'ler sinirlar icerisinde ise
               baslangic index'i dahil, bitis index'i haric olacak sekilde
               iki index arasindaki harfleri yazdirin
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        System.out.println("Lutfen baslangic index'ini giriniz");
        int baslangic = scanner.nextInt();

        System.out.println("Lutfen bitis index'ini giriniz");
        int bitis = scanner.nextInt();

        if (baslangic > bitis){
            System.out.println("Baslangic index'i bitis index'inden kucuk olmalidir");
        } else if (baslangic >= metin.length() || bitis >= metin.length()) {
            System.out.println("Verilen index'ler metnin disinda");
        }else{

            for (int i = baslangic; i <bitis ; i++) {
                System.out.print(metin.charAt(i));
            }
        }


        System.out.println("");
        System.out.println(metin.substring(baslangic, bitis));



    }
}
