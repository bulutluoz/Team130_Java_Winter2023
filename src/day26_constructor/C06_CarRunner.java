package day26_constructor;

public class C06_CarRunner {

    public static void main(String[] args) {

        C05_Car car1 = new C05_Car("Toyota","Corolla");

        System.out.println(car1);
        // C05_Car{ marka='Toyota',
        //          model='Corolla',
        //          renk='Renk belirtilmemis',
        //          yil=1900, fiyat=0}

       C05_Car car2 = new C05_Car("Renault","Clio","Kahve",2010,3000);

        System.out.println(car2);
        // C05_Car{marka='Renault', model='Clio', renk='Kahve', yil=2010, fiyat=3000}


        C05_Car car3 = new C05_Car("Audi","A4","Gri",2015,15000);
        System.out.println(car3);
        // C05_Car{marka='Audi', model='A4', renk='Gri', yil=2015, fiyat=15000}



    }
}
