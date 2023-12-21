package day44_maps;

import java.util.HashMap;
import java.util.Map;

public class C06_NestedMap {

    public static void main(String[] args) {
        //        ogrenciMap.put(101,"isim = ali- soyisim = Can- sinif = 11- sube =H- bolum=MF");
        //        ogrenciMap.put(102,"VELI-Cem-10-K-TM");
        //        ogrenciMap.put(103,"ALi-Cem-11-K-TM");

        Map<String,String > ogrenci101ValueMap = new HashMap<>();
        ogrenci101ValueMap.put("Isim","Ali");
        ogrenci101ValueMap.put("Soyisim","Can");
        ogrenci101ValueMap.put("Sinif","11");
        ogrenci101ValueMap.put("Sube","H");
        ogrenci101ValueMap.put("Bolum","MF");

        Map<String,String > ogrenci102ValueMap = new HashMap<>();
        ogrenci102ValueMap.put("Isim","Veli");
        ogrenci102ValueMap.put("Soyisim","Cem");
        ogrenci102ValueMap.put("Sinif","10");
        ogrenci102ValueMap.put("Sube","K");
        ogrenci102ValueMap.put("Bolum","TM");

        Map<String,String > ogrenci103ValueMap = new HashMap<>();
        ogrenci103ValueMap.put("Isim","Ali");
        ogrenci103ValueMap.put("Soyisim","Cem");
        ogrenci103ValueMap.put("Sinif","11");
        ogrenci103ValueMap.put("Sube","K");
        ogrenci103ValueMap.put("Bolum","TM");

        Map<Integer,Map<String,String >> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,ogrenci101ValueMap);
        ogrenciMap.put(102,ogrenci102ValueMap);
        ogrenciMap.put(103,ogrenci103ValueMap);

        System.out.println(ogrenciMap);

        /*
        {
           101=  {Bolum=MF, Soyisim=Can, Sube=H, Sinif=11, Isim=Ali},
           102=  {Bolum=TM, Soyisim=Cem, Sube=K, Sinif=10, Isim=Veli},
           103=  {Bolum=TM, Soyisim=Cem, Sube=K, Sinif=11, Isim=Ali}
           }
         */

        // 102 numarali ogrencinin soyadini yazdirin

        System.out.println(     ogrenciMap.get(102).get("Soyisim")           ); // Cem

        // 103 numarali ogrencinin sinifini 12 yapin

        ogrenciMap.get(103).put("Sinif","12");

        // 102 numarali ogrencinin bolumunu yazdirin
        System.out.println(  ogrenciMap.get(102).get("Bolum")       ); // TM

        // 102 numarali ogrencinin bolumunu MF yapin

        ogrenciMap.get(102).put("Bolum","MF");

        System.out.println(ogrenciMap);



    }
}
