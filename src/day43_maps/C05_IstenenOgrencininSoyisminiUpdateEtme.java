package day43_maps;

import java.util.HashMap;
import java.util.Map;

public class C05_IstenenOgrencininSoyisminiUpdateEtme {

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

        // 110 numarali ogrencinin soyismini mismis yapin

        ogrenciMap.put(103,"Ali-Han-12-M-MF");

        System.out.println(ogrenciMap.get(103)); // Ali-Han-12-M-MF
        // eger bir map'de varolan key ile yeni bir element eklerseniz
        // o key'e ait eski value'yu siler, yeni value'yu kabul eder

        // soruyu manuel olarak yapacak olsaydik
        // ogrenciMap.put(110,"Azim-Mismis-11-K-TM");

        /*
            Update islemlerini dinamik olarak yapabilmek icin
            once degistirmek istedigimiz bilgiye ulasmaliyiz
            bunu onceki sorularda yaptigimiz gibi
            once value'ye ulasip, value'yu split edip
            istedigimiz bilgiye ulasabiliriz

         */

        // 1- istenen ogrencinin value'sune ulasip kaydedin

        String value110 = ogrenciMap.get(110); // Azim-Kayisi-11-K-TM

        // 2- value110'da istedigimiz bilgiye ulasabilmek icin split yapip kaydedin

        String[] value110Arr = value110.split("-"); // [Azim, Kayisi, 11, K, TM]

        // 3- simdi istenen degisikligi array'de yapin

        value110Arr[1] = "Mismis"; // [Azim, Mismis, 11, K, TM]

        // istenen degisikligi array'de yaptiktan sonra, map'i guncelleyebilmek  icin
        // array'i yeniden String value formuna donusturmeliyiz
        // Azim-Mismis-11-K-TM

        // 4- degisen array'i yeniden value Formatina getir

        String yeniValue = value110Arr[0] + "-"+value110Arr[1]+"-"+value110Arr[2]+"-"
                            +value110Arr[3]+"-"+ value110Arr[4]; // Azim-Mismis-11-K-TM

        // 5- map'i guncelle

        ogrenciMap.put(110,yeniValue);

        System.out.println(ogrenciMap);


    }
}
