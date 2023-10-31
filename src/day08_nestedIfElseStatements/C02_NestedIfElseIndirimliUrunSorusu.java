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

        double indirimsizToplamSatisFiyati = urunAdedi*indirimsizFiyat;

    }
}
