package day02_dataTurleri_Scanner;

public class C01_DataTurleri {

    public static void main(String[] args) {

        int sayi1 = 23; // hafizada 32 bit

        byte sayi2 = 23; // hafizada 8 bit

        short sayi3 = 23; // hafizada 16 bit

        long sayi4 = 23 ;// hafizada 64 bit

        char ch1 = '4';
        char ch2 = ' '; // space de #,%,& gibi bir karakterdir
        // char ch3 = '4 '; char data turu sadece 1 karakter kabul eder

        String str1 = "Java Candir";
        String telefonNo = "5552344567";
        // int tel = 5552344567; telefon numarasi matematiksel islemlerde kullanilmadigindan
        //                       ve int degerlerinden buyuk oldugundan String olarak tutulabilir


        System.out.println("str1"); // str1
        System.out.println(str1); // Java Candir

        int x = 23;
        int y = 13;

        // iki sayinin toplamini yazdirin

        System.out.println("Verilen iki sayinin toplami : "  + (x+y)); // 36
        // Verilen iki sayinin toplami : 36


        x= 15;

        System.out.println("x : " + x); // x : 15

        x = 3 * x +1 ;

        System.out.println("x'in yeni degeri : " + x); // x'in yeni degeri : 46

        float fl1 = 20f;
        float fl2 = 6f;

        System.out.println(fl1 / fl2 ); // 3.3333333

        double dbl1 = 20;
        double dbl2 = 6;

        System.out.println(dbl1 / dbl2 ); // 3.3333333333333335




    }
}
