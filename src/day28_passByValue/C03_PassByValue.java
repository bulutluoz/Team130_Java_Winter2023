package day28_passByValue;

public class C03_PassByValue {

    public static void main(String[] args) {

        // verilen fiyat uzerinden %10 indirimli fiyat hesaplayip
        // indirimli fiyati yazdiran bir method olusturun

        /*
            Farkli scope'larin icinde
            ayni isimde variable'lar olabilir
            bu variable'larda yapilan degisiklikler
            sadece icinde olduklari scope'da gecerlidir
         */

        double fiyat = 200;

        yuzde10IndirimliFiyatYazdir(fiyat);

        System.out.println(fiyat); // 200
    }


    public static void yuzde10IndirimliFiyatYazdir(double fiyat){

        fiyat = fiyat * 90 / 100;

        System.out.println("Indirimli fiyat : " + fiyat); // 180

    }

}
