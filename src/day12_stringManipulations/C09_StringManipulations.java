package day12_stringManipulations;

import java.util.Scanner;

public class C09_StringManipulations {

    public static void main(String[] args) {

        // kullanicidan isim, soyisim ve kredi karti numarasini alin
        // gorunurIsim olarak A****** N****** seklinde
        // sadece ilk harfler buyuk harf olarak gorunsun, diger harfler * olsun
        // gorunur kart no : **** **** **** 1234 olsun

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("Lutfen kart numaranizi bosluksuz 16 karakter olarak yazin");
        String kkNo = scanner.nextLine();

        String gorunurIsim = isim.substring(0,1).toUpperCase()
                             + isim.substring(1).replaceAll("\\w","*")
                             + " "
                             + soyisim.substring(0,1).toUpperCase()
                             + soyisim.substring(1).replaceAll("\\S" ,"*");

        String gorunurKartNo = "**** **** **** " + kkNo.substring(kkNo.length()-4);


        System.out.println(gorunurIsim);
        System.out.println(gorunurKartNo);
    }
}
