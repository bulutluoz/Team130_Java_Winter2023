package day32_encapsulation;

public class C06_Runner {

    public static void main(String[] args) {

        /*
        Bir class'daki tum variable'lar private yapilip
        sadece getter method'lari olusturulursa
        bu class read only (immutable) olur
         */

        /*
            Bir variable'i private yapip
            hem getter, hem de setter method'u olusturursak
            public gibi olur

            Bu yontem bazi developer'lar tarafindan
            yapilan isleme vurgu yapmak amaciyla kullanilir
         */



        C05_Encapsulation obj = new C05_Encapsulation();

        // isme deger atayalim
        obj.setIsim("Ali");
        // isim variable'inin degerini yazdiralim
        System.out.println(obj.getIsim()); // Ali


        // soyisim'e deger atayalim
        obj.soyisim = "Celik";
        // soyisim variable'inin degerini yazdiralim
        System.out.println(obj.soyisim); // Celik
    }
}
