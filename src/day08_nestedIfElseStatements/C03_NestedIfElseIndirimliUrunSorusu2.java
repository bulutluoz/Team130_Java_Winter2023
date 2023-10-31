package day08_nestedIfElseStatements;

import java.util.Scanner;

public class C03_NestedIfElseIndirimliUrunSorusu2 {

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

        if (urunAdedi > 10){

            // urun miktari 10'dan cok olanlar
            if (kartVarMi =='E'){
                indirimOrani =20;
            } else if (kartVarMi == 'H') {
                indirimOrani =15;
            }else {
                System.out.println("kart bilgisi hatali");
            }

        } else if (urunAdedi > 0) {

            // urun miktari 1-10(dahil) arasinda olanlar
            if (kartVarMi == 'E'){
                indirimOrani = 15;
            } else if (kartVarMi == 'H') {
                indirimOrani =10;
            }else{
                System.out.println("kart bilgisi hatali");
            }


        }else{
            // urun miktari 0 veya negatif olanlar
            System.out.println("Urun miktari hatali");
        }

        System.out.println( indirimOrani + " indirimli toplam fiyat : " +
                            urunAdedi* indirimsizFiyat * (100-indirimOrani) / 100);
    }
}
