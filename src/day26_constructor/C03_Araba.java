package day26_constructor;

public class C03_Araba {

    String marka = "Marka belirtilmemis";
    String model = "Model belirtilmemis";
    String renk = "Renk belirtilmemis";
    int yil = 1900;
    int fiyat;

    C03_Araba(){
        marka = "Toyota";
        yil = 2010;
    }

    C03_Araba(String mrk , String mdl){
        marka = mrk;
        model = "A180";
        yil = 2019;
    }

    C03_Araba(String mrk , String mdl,int fyt){
        marka = "Mercedes";
        model = mdl;
        fiyat = 20000;
        renk = "Yesil";
    }

    @Override
    public String toString() {
        return "C03_Araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }
}
