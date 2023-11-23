package day25_constructors;

public class C03_Runner {

    public static void main(String[] args) {

        /*
            Java'da herhangi bir class'dan obje olusturdugunuzda
            Java ilk olarak o objeyi olusturur
            olusturuldugu class'daki
            tum instance variable'larin birer kopyasini olusturup
            objeye yapistirir
         */

        // Java'da bir obje olusturmak istedigimizde

        C02_Araba araba1 = new C02_Araba();

        araba1.marka = "Tofas";


        C02_Araba araba2 = new C02_Araba();

        System.out.println(araba2.marka); // Marka belirtilmemis

        araba2.marka = "Mercedes";


        C02_Araba araba3 = new C02_Araba();

        System.out.println(araba3.marka);
    }

}
