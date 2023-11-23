package day25_constructors;

public class C06_ArabaRunner {

    public static void main(String[] args) {

        C02_Araba araba;
        // Constructor kullanilmadigindan obje olusturulacagi soylenmis
        // ama obje olusturulup ilk deger atamasi YAPILMAMISTIR

        // System.out.println(araba.fiyat);
        // Variable 'araba' might not have been initialized

        // araba.motor();
        //Variable 'araba' might not have been initialized

        C02_Araba araba1 = new C02_Araba() ;
        // Eger constructor body'sinde bir atama yoksa
        // veya default constructor kullanilmissa
        // olusturulan obje
        // olusturuldugu class'da ilk atanmis olan degerlere sahip olur

        System.out.println(araba1); // class'da toString() varsa ozellikleri yazdirir

        // Araba Ozellikleri {marka : 'Marka belirtilmemis', model : 'Model belirtilmemis', renk : 'Renk belirtilmemis', yil : 1900, fiyat : 0}


        // 2000 model, yesil, fiyati 3000 olan bir opel corsa olusturun
        // once bir obje olusturup, sonra istenen degerlerin atamasini yapabiliriz

        C02_Araba araba2 = new C02_Araba();

        araba2.marka ="Opel";
        araba2.model = "Corsa";
        araba2.yil = 2000;
        araba2.renk = "Yesil";
        araba2.fiyat = 3000;

        System.out.println(araba2);
        // Araba Ozellikleri {marka : 'Opel', model : 'Corsa', renk : 'Yesil', yil : 2000, fiyat : 3000}


    }
}
