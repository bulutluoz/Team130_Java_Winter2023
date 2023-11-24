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

        C01_Car car3 = new C01_Car("Volvo","C40");

        System.out.println(car3);

        //Araba Ozellikleri {marka : 'Volvo',
        //                  model : 'C40',
        //                  renk : 'Renk belirtilmemis',
        //                  yil : 1900, fiyat : 0}


        // Nissan, 2012, mavi bir araba olustur

        C01_Car car4 = new C01_Car("Nissan","Mavi",2012);

        System.out.println(car4);
        //Araba Ozellikleri {marka : 'Nissan',
        //                  model : 'Model belirtilmemis',
        //                  renk : 'Mavi',
        //                  yil : 2012, fiyat : 0}


        C01_Car car5 = new C01_Car("Tofas","Sahin","Kirmizi",1990,150000);

        System.out.println(car5);

        // Araba Ozellikleri {marka : 'Tofas',
        //                    model : 'Sahin',
        //                    renk : 'Kirmizi',
        //                    yil : 1990,
        //                    fiyat : 150000}
    }
}
