package day28_passByValue;

public class C04_PassByValueReturn {

    public static void main(String[] args) {
        /*
            Method'lar arasi geciste
            variable'in kendisi degil degeri yollanir

            her method'un icindeki local variable
            o method'da gecerli oldugundan
            main method'da atama varsa, main method'daki fiyat variable'i kalici degisir
            diger method'da atama varsa o method'daki variable'in degeri degisir

            method her cagrildiginda
            sanki ilk defa calisiyor gibi
            sifirdan baslar
         */

        // verilen bir fiyat icin
        // %10 indirimli fiyati hesaplayip
        // indirimli fiyati döndüren bir method olusturun

        double fiyat = 200;

        System.out.println(fiyat); // 200

        // indirimli fiyati yazdirmak istersem

        System.out.println(yuzde10IndirimliFiyatHesapla(fiyat)); // 180

        System.out.println(fiyat); // 200

        // %10 indirimli fiyati kalici hale getirin

        fiyat = yuzde10IndirimliFiyatHesapla(fiyat);

        System.out.println(fiyat); // 180

    }

    public static double yuzde10IndirimliFiyatHesapla(double fiyat){

        fiyat = fiyat * 90 / 100;

        return fiyat;
    }


}
