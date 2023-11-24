package day26_constructor;

public class C01_Car {

    String marka = "Marka belirtilmemis";
    String model = "Model belirtilmemis";
    String renk = "Renk belirtilmemis";
    int yil = 1900;
    int fiyat;

    public void motor(){
        System.out.println("Tum arabalarin motoru olur");
    }

    public void guvenlik(){
        System.out.println("Tum arabalarin guvenlik donanimlari olmalidir");
    }

    C01_Car(String mrk, String mdl){
        marka = mrk;
        model = mdl;
    }

    C01_Car(){

    }

    C01_Car(String mrk,String rnk, int yl ){
        marka = mrk;
        renk = rnk;
        yil = yl;
    }

    C01_Car(String mrk, String mdl, String rnk, int yl, int fyt){
        marka = mrk;
        model = mdl;
        renk = rnk;
        yil = yl;
        fiyat =fyt;
    }



    public String toString() {
        return "Araba Ozellikleri {" +
                "marka : '" + marka + '\'' +
                ", model : '" + model + '\'' +
                ", renk : '" + renk + '\'' +
                ", yil : " + yil +
                ", fiyat : " + fiyat +
                '}';
    }
}
