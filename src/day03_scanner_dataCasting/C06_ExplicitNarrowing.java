package day03_scanner_dataCasting;

public class C06_ExplicitNarrowing {

    public static void main(String[] args) {

        // Explicit narrowing yaptigimizda
        // data kayiplari olabilir
        // hatta bazen data baska bir sayiya donusebilir

        double dbl = 34.99 ;

        int sayi = (int) dbl;

        System.out.println(sayi); // 34 ondalikli kismi siler


        int sayi1 = 23;
        byte byt = (byte) sayi1;

        System.out.println("23'un byte olarak degeri " + byt); // 23


        int sayi2 = 130;
        byt = (byte) sayi2;
        System.out.println("130'un byte olarak degeri " + byt); // -126

        int sayi3 = 260;
        byt = (byte) sayi3;
        System.out.println("260'un byte olarak degeri " + byt); // 4


        int sayi4 = 2600;
        byt = (byte) sayi4;
        System.out.println("2600'un byte olarak degeri " + byt); // 40


        int sayi5 = 2100000000;
        sayi5 = sayi5 + 500000000; // casting yok

        System.out.println(sayi5); // -1694967296



    }
}
