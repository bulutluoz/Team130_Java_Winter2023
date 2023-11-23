package day25_constructors;

public class C02_Araba {

    String marka = "Marka belirtilmemis";
    String model = "Model belirtilmemis";
    String renk = "Renk belirtilmemis";
    int yil = 1900;
    int fiyat;


    public String toString() {
        return "Araba Ozellikleri {" +
                "marka : '" + marka + '\'' +
                ", model : '" + model + '\'' +
                ", renk : '" + renk + '\'' +
                ", yil : " + yil +
                ", fiyat : " + fiyat +
                '}';
    }

    C02_Araba(){
        // Bu constructor
        // default constructor ile ayni isleve sahiptir
        // AMMA gorunur oldugundan buna
        // default constructor denmez
        // parametresiz constructor denir
        // Bu constructor'in body'sine kod yazabiliriz
        // ama default constructor'in body'sinde kod olmaz

    }


    public void motor(){
        System.out.println("Tum arabalarin motoru olur");
    }

    public void guvenlik(){
        System.out.println("Tum arabalarin guvenlik donanimlari olmalidir");
    }
}
