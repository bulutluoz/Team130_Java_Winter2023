package day44_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C02_TumOgrencileriustSinifagecirme {

    public static void main(String[] args) {

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

        // Ogrenci Map'inde tum ogrencileri bir ust sinifa gecirin,
        // 12.siniftakilere sinif bilgisi olarak mezun yazdirin

        Set<Integer> keySeti = ogrenciMap.keySet();

        for (Integer eachKey: keySeti
             ) {

            String eachValue = ogrenciMap.get(eachKey);

            String[] eachValueArr = eachValue.split("-");

            String mevcutSinif = eachValueArr[2];

            if (mevcutSinif.equals("12") || mevcutSinif.equalsIgnoreCase("Mezun")){
                eachValueArr[2] = "Mezun";
            }else{
                eachValueArr[2] = Integer.parseInt(mevcutSinif) + 1+"";
            }

            String yeniValue = eachValueArr[0] + "-"+eachValueArr[1]+"-"+eachValueArr[2]+"-"
                    +eachValueArr[3]+"-"+ eachValueArr[4];

            // key ile yeni updated value'yu kullanarak map'i update edelim

            ogrenciMap.put(eachKey,yeniValue);

        }

        System.out.println(ogrenciMap);
    }
}
