package day44_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_MapdekiIsimleriDuzenleme {

    public static void main(String[] args) {

        // 4- Ogrenci Map'indeki tum isimleri ilk harf buyuk sonraki harfler kucuk,
        //    tum soyisimleri ile tamamen buyuk harf yapin


        Map<Integer,String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,"ali-Can-11-H-MF");
        ogrenciMap.put(102,"VELI-Cem-10-K-TM");
        ogrenciMap.put(103,"ALi-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
        ogrenciMap.put(108,"Azim-Kan-12-L-SOZ");
        ogrenciMap.put(109,"Huseyin-Fan-12-H-MF");
        ogrenciMap.put(110,"Azim-Kayisi-11-K-TM");


        // update isteniyor

        // tum key'leri alalim
        Set<Integer> keySeti  = ogrenciMap.keySet();

        // bir for-each loop ile keySet'indeki tum key'lere ait value'lari gozden gecirelim

        for (Integer eachKey: keySeti
             ) {

            // value'yu String olarak kaydedelim

             String eachValue = ogrenciMap.get(eachKey);

            // split ile value'yu array'e cevirelim

            String[] eachvalueArr = eachValue.split("-"); // [Esra, Han, 11, M, SOZ]
            // array'de update yapalim
            // tum isimleri ilk harf buyuk sonraki harfler kucuk,
            // tum soyisimleri ile tamamen buyuk harf yapin

            eachvalueArr[0] = eachvalueArr[0].substring(0,1).toUpperCase()+ // ilk harf buyuk harf
                              eachvalueArr[0] .substring(1) .toLowerCase();// geriye kalanlar kucuk harf

            eachvalueArr[1] = eachvalueArr[1].toUpperCase(); // tum harfleri buyuk yaptim


            // array'i yeniden String value formatina sokalim
            String yeniValue = eachvalueArr[0] + "-"+eachvalueArr[1]+"-"+eachvalueArr[2]+"-"
                    +eachvalueArr[3]+"-"+ eachvalueArr[4];

            // key ile yeni updated value'yu kullanarak map'i update edelim

            ogrenciMap.put(eachKey,yeniValue);
        }

        System.out.println(ogrenciMap);
    }
}
