package day26_constructor;

public class C05_Car {
    String marka = "Marka belirtilmemis";
    String model = "Model belirtilmemis";
    String renk = "Renk belirtilmemis";
    int yil = 1900;
    int fiyat;

    C05_Car(){

    }

    // marka ve model parametreli bir constructor olusturalim
    C05_Car(String mrk, String mdl){
        marka = mrk;
        model = mdl;
    }


    // tum variable'larin oldugu bir constructor olusturalim

    C05_Car(String marka, String model, String renk, int yil, int fiyat){

        /*
            Constructor icinde atama yapmanin amaci
            parametre olarak gelen degeri
            class level'daki instance variable'a atamaktir

            eger parametre ve instance isimleri AYNI DEGILSE
            renk = rnk;
            yil = yl;
            java burada class level'daki ile scope'daki variable'lari ayirabilir

            eger parametre ismi ile instance variable ismi AYNI ISE
             marka = marka;
             model = model;
             java burada hangisinin parametreden gelen variable,
             hangisinin class level'daki variable olduguna bakmaz
             cunku java kolayi tercih eder
             scope'da variable'i bulursa class level'a bakmaz

             bu durumda javaya hangisinin class level'daki
             instance variable oldugunu BELIRTMEMIZ lazim

             Java bu ihtiyac icin bize this. keyword'unu vermistir

             Bir variable'in onunde this. keyword kullanilirsa
             Java bu variable'i aramaya
             icinde oldugu scope'dan degil, class level'dan baslar

         */

        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yil = yil;
        this.fiyat = fiyat;
    }










    @Override
    public String toString() {
        return "C05_Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }
}
