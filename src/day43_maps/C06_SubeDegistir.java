package day43_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C06_SubeDegistir {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
        ogrenciMap.put(108,"Azim-Kan-12-L-SOZ");
        ogrenciMap.put(109,"Huseyin-Fan-12-H-MF");
        ogrenciMap.put(110,"Azim-Kayisi-11-K-TM");

        // eskiSube olarak verilen subedeki, tum ogrencilerin subelerini
        // yeniSube olarak verilen sube yapin

        String eskiSube = "K";
        String yeniSube = "Z";

        Set<Integer> ogrenciKeySet = ogrenciMap.keySet();
        // [101, 102, 103, 104, 105, 106, 107, 108, 109, 110]

        for (Integer eachKey: ogrenciKeySet
             ) {

            String eachValue = ogrenciMap.get(eachKey); // Azim-Kayisi-11-K-TM

            String[] eachValueArr = eachValue.split("-"); // [Azim, Kayisi, 11, K, TM]

            // subesi K ise Z yap

            if (eachValueArr[3].equalsIgnoreCase(eskiSube)){
                eachValueArr[3] = yeniSube;
            }

            // duzeltilmesi gereken bir bilgi varsa duzeltildi
            // bu bilgilerle map'i guncelleyelim

            String yeniValue = eachValueArr[0] + "-"+eachValueArr[1]+"-"+eachValueArr[2]+"-"
                    +eachValueArr[3]+"-"+ eachValueArr[4];

            ogrenciMap.put(eachKey,yeniValue);


        }

        System.out.println(ogrenciMap);
    }
}
