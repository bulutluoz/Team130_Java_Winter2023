package day04_wrapperClasses_Increment;

public class C05_preIncrement_postIncrement {

    public static void main(String[] args) {

        int a = 10;

        a++;

        System.out.println( "a'nin 11 satirdaki degeri : " + a);
        // a'nin 11 satirdaki degeri : 11


        a= 10;

        ++a;

        System.out.println( "a'nin 19 satirdaki degeri : " + a);
        // a'nin 19 satirdaki degeri : 11


        /*
            Java'da 3 farkli sekilde deger artirma mumkun

            -     sayi = sayi + 1 ;
            -     sayi += 1;
            -     sayi++;

            sadece 3.yontem icin
            java ihtiyaca gore kullanilabilmesi amaciyla
            iki farkli kullanim olusturmustur

            sayi++ yazabildigimiz gibi ++sayi da yazabiliriz



         */

        int b = 10;
        System.out.println( "++b yazdigimda konsolda yazdirilan : "   +   ++b); // 11

        System.out.println( "++b'den 1 satir sonra konsolda b degeri : " + b); // 11


        int c = 10;
        System.out.println( "c++ yazdigimda konsolda yazdirilan : "   +   c++); // 10

        System.out.println( "c++'den 1 satir sonra konsolda c degeri : " + c); // 11



        int x = 10;

        int y  = x++;

        System.out.println("x : " + x + ", y : " + y); // x : 11, y : 10



        x= 10;
        y = ++x ;

        System.out.println("x : " + x + ", y : " + y); // x : 11, y : 11

    }
}
