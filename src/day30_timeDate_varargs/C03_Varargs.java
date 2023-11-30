package day30_timeDate_varargs;

public class C03_Varargs {


    public static void main(String[] args) {

        /*
            Vararg : variety of arguments demektir
            varargs degisken sayida argument kullanmamiza imkan taniyan
            array altyapisini kullanan bir java objesidir.

            siz argument olarak (4,5) yollarsaniz int[] sayi ={4,5} olur
                                (4,2,7)           int[] sayi = {4,2,7}
                                (4,5,6,7,8,9)     int[] sayi = {4,5,6,7,8,9}
         */

        // verilen 2 sayinin toplamini yazdiran bir method olusturun

        topla(4,5); //9
        topla(4,2,7); // 13
        topla(1,2,3,4); // 10
        topla(1,2,3,4,5,6,7);// 28
        topla(4,5,6,7,8,9);// 39
    }

    public static void topla(int... sayi){

        // burada sayi bir tek sayi degil,
        // kac tane argument yollarsak hepsini alabilecek bir array'dir

        int toplam = 0;
        for (int each : sayi
             ) {

            toplam += each;
        }

        System.out.println(toplam);
    }


}
