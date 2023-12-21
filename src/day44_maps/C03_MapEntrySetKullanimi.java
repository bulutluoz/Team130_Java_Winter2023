package day44_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_MapEntrySetKullanimi {

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

        // ogrenciMap'indeki tum key'leri yazdirin

        System.out.println(ogrenciMap.keySet());
        // [101, 102, 103, 104, 105, 106, 107, 108, 109, 110]

        // ogrenci map'indeki tum value'leri yazdirin

        System.out.println(ogrenciMap.values());

        System.out.println("============");
        System.out.println(ogrenciMap);

        // bu iki method ile key ve value'lere ayri ayri erisebilirim
        // java key ve value'lere beraber erisebilmemiz icin
        // alternatif bir yontem olarak EntrySet<> olusturmustur


         Set<Map.Entry<Integer,String>>  ogrenciEntrySeti = ogrenciMap.entrySet();

        System.out.println("============");

        System.out.println(ogrenciEntrySeti);

        // KeySet kullanmak yerine EntrySet kullanmanin 2 avantaji vardir
        // 1- once key'e gidip oradan value'ye ulasmak yerine
        //    entry'den hem key'e hem de value'ye ulasabiliriz
        // 2- entry.setValue() ile direk map'i update edebilirsiniz


        for (Map.Entry<Integer,String> eachEntry : ogrenciEntrySeti
             ) {

            String[] eachValueArr = eachEntry.getValue().split("-");

            String mevcutSinif = eachValueArr[2];

            if (mevcutSinif.equals("12") || mevcutSinif.equalsIgnoreCase("Mezun")){
                eachValueArr[2] = "Mezun";
            }else{
                eachValueArr[2] = Integer.parseInt(mevcutSinif) + 1+"";
            }

            eachEntry.setValue(eachValueArr[0] + "-"+eachValueArr[1]+"-"+eachValueArr[2]+"-"
                    +eachValueArr[3]+"-"+ eachValueArr[4]);
        }
        System.out.println(ogrenciMap);
    }
}
