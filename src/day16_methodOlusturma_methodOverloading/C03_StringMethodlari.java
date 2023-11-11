package day16_methodOlusturma_methodOverloading;

public class C03_StringMethodlari {

    public static void main(String[] args) {

        String str = "Java cok kolay, yeter ki anlayalim";

        str.toLowerCase();  // metni kucuk harfe cevirir
                            // ama yazdirmadigimiz veya atama yapamadigimiz icin
                            // bosa calismis olur


        C02_returnTypeIleMethodOlusturma.ismiIstenenFormataCevir("Asli","Nehaber");


        // bize birsey döndüren method'lari ya uygun bir variable'a atamaliyiz
        // veya direk olarak yazdirmaliyiz
        // aksi takdirde method calisir, bize sonucu döndürür (getirir)
        // ama kullanmadigimiz icin havaya ucar
    }
}
