package day26_constructor;

public class C02_CarRunner {

    public static void main(String[] args) {

        C01_Car car1 = new C01_Car();

        System.out.println(car1);
        // Araba Ozellikleri {
        // marka : 'Marka belirtilmemis',
        // model : 'Model belirtilmemis',
        // renk : 'Renk belirtilmemis',
        // yil : 1900, fiyat : 0}

        car1.marka = "Opel";
        car1.model = "vectra";
        car1.renk = "Siyah";
        car1.yil = 2008;
        car1.fiyat = 5000;

        System.out.println(car1);
        //Araba Ozellikleri {marka : 'Opel',
        //                  model : 'vectra',
        //                  renk : 'Siyah',
        //                  yil : 2008,
        //                  fiyat : 5000}

        // bana toyota, corolla araba uret
        C01_Car car2 = new C01_Car("Toyota","Corolla");

        System.out.println(car2);
        //Araba Ozellikleri {marka : 'Toyota',
        //                  model : 'Corolla',
        //                  renk : 'Renk belirtilmemis',
        //                  yil : 1900, fiyat : 0}

    }
}
