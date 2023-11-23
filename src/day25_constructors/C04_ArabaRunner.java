package day25_constructors;

public class C04_ArabaRunner {

    public static void main(String[] args) {

        /*
            java'da her obje olusturdugumuzda
            java objeyi olusturur ve
            instance variable'larin birer kopyasini
            bu objeye yapistirir

            Bu islemi java'da yapan yapi
            constructor'dir.

            bir constructor calismadan
            olusturulan objeye
            ilk deger atamasi (initialization)
            yapilmasi mumkun degildir

            Bir constructor olusturmak icin
            syntax ClassAdi(){ } seklindedir

            C02_Araba()  yazimi method'a benzer
            ama method degil constructor'dir.

            Bir yapinin method mu yoksa constructor mi
            oldugunu anlamak icin 2 seye bakmaliyiz

            1- constructor'in ismi class ile ayni olmalidir
               (yani buyuk harfle baslar)
            2- constructor'larin return type'i olmaz
         */

             C02_Araba                  araba      =          new       C02_Araba();
    //objenin olusturuldugu class  objenin adi  assignment  keyword     Constructor
    //objenin data turu

    }
}
