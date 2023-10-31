package day08_nestedIfElseStatements;

import java.util.Scanner;

public class C02_NestedIfElseIndirimliUrunSorusu {

    public static void main(String[] args) {
        //Soru 3- Kullanicidan aldigi urun adedini ve urunun indirimsiz fiyatini alin,
        //        kullaniciya musteri karti olup olmadigini sorun.
        //        Musteri karti varsa 10 urunden fazla alirsa %20, az alirsa %15 indirim yapin,
        //        Musteri karti yoksa 10 urunden fazla alirsa %15, az alirsa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satin aldiginiz urun adedini giriniz");
        int urunAdedi = scanner.nextInt();

        System.out.println("Aldiginiz urunun indirimsiz fiyatini giriniz");
        double indirimsizFiyat = scanner.nextDouble();

        System.out.println("Musteri kartiniz var mi ?  E : evet , H : Hayir");
        char kartVarMi = scanner.next().toUpperCase().charAt(0);

        int indirimOrani = 0;

        /*
            if else ile soru cozerken
            degisken sayisi 1'den fazla ise ic ice if else cumleleri kullanabiliriz

            Once degiskenlerden birini
            asil degisken secip
            yapiyi ona gore kuralim

            bu class'da musteri karti asil degisken olsun
            kart bilgisine gore 3 ihtimali yazdiktan sonra
            her ihtimalin icine bu defa urun miktarina gore if else yazalim

         */

        if (kartVarMi == 'E'){
            // buraya gelen musterinin karti var
            if (urunAdedi>10){
                indirimOrani = 20;
            } else if (urunAdedi > 0){
                indirimOrani = 15;
            }else {
                System.out.println("urun miktari hatali");
            }

        } else if (kartVarMi == 'H') {
            // buraya gelen musterinin karti yok
            if (urunAdedi>10){
                indirimOrani = 15;
            } else if (urunAdedi > 0){
                indirimOrani = 10;
            }else {
                System.out.println("urun miktari hatali");
            }
        }else {
            System.out.println("Kart bilgisi hatali");
        }

        if (indirimOrani>0){
            System.out.println(indirimOrani + " indirimli toplam fiyat : " +
                                indirimsizFiyat*urunAdedi*(100-indirimOrani) /100);
        }

    }
}
