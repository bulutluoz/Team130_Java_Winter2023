package day26_constructor;

public class C04_ArabaRunner {

    public static void main(String[] args) {

        C03_Araba araba1 = new C03_Araba();

        /*
            Kod okuma sorularinda
            OLMASI GEREKEN veya KODUN DOGRUSU BOYLE OLMALI
            diye dusunemeyiz

            Yapmamiz gereken
            Javanin yapacagi kod takibini yapip
            kod ne islem yapiyorsa onlari anlamaktir

         */

        System.out.println(araba1);
        //C03_Araba{marka='Toyota',
        //          model='Model belirtilmemis',
        //          renk='Renk belirtilmemis',
        //          yil=2010, fiyat=0}


        // verilen C03_Araba class'i ile
        // asagidaki araba2 objesi olusturulursa
        // araba2'nin model'i ne olur?
       C03_Araba araba2 = new C03_Araba("Toyota","Corolla");

        System.out.println(araba2);
        // C03_Araba{marka='Toyota',
        //          model='A180',
        //          renk='Renk belirtilmemis',
        //          yil=2019, fiyat=0}


        // verilen C03_Araba class'i ile
        // asagidaki araba3 objesi olusturulursa
        // araba3'un marka, model ve fiyati ne olur?

        C03_Araba araba3 = new C03_Araba("Nissan","Micra",5000);

        System.out.println(araba3);
        //C03_Araba{marka='Mercedes',
        //          model='Micra',
        //          renk='Yesil',
        //          yil=1900, fiyat=20000}


    }
}
