package day45_Maps_THE_END;

import java.util.Map;
import java.util.TreeMap;

public class C06_TreeMap {

    public static void main(String[] args) {

        // Map<String,Integer> harfler = new TreeMap<>();
        TreeMap<String,Integer> harfler = new TreeMap<>();
        harfler.put("K",20);
        harfler.put("B",30);
        harfler.put("C",50);
        harfler.put("Z",80);
        harfler.put("A",30);
        harfler.put("E",50);
        harfler.put("U",80);

        System.out.println(harfler); // {A=30, B=30, C=50, E=50, K=20, U=80, Z=80}

        /*
            Eger data turu olarak Map secilirse
            diger tum map'lerle HashMap vs ile ortak olan ozellikleri gosterir

            Data turu TreeMap secilince
            tum map'lerde olan ortak method'larin tamami geldigi gibi
            sadece Treemap'e ozel olan bazi method'lar da gelir
         */

        System.out.println(harfler.lowerKey("K")); // E  <
        System.out.println(harfler.lowerKey("T")); // K  <
        System.out.println(harfler.floorKey("E")); // E  <=
        System.out.println(harfler.floorKey("D")); // C  <=


        System.out.println(harfler.higherKey("F")); // K   >
        System.out.println(harfler.higherKey("U")); // Z   >
        System.out.println(harfler.ceilingKey("C")); // C  >=
        System.out.println(harfler.ceilingKey("D")); // E  >=

        System.out.println(harfler.descendingMap()); // {Z=80, U=80, K=20, E=50, C=50, B=30, A=30}

        // harfler = harfler.descendingMap();
        // TreeMap HERZAMAN dogal sirali olarak elemanlarini tutar
        // ters sirali olan bir map, TreeMap olarak kaydedilemez

        harfler.put("M",34);

        // tree map elemanlari dogal sirali tuttugu icin
        // once M'nin nerede olmasi gerektigini hesaplar
        // sonra put islemini yapar

        System.out.println(harfler); // {A=30, B=30, C=50, E=50, K=20, M=34, U=80, Z=80}

        System.out.println(harfler.subMap("C", "M")); // {C=50, E=50, K=20}
        System.out.println(harfler.tailMap("K")); // {K=20, M=34, U=80, Z=80}
        System.out.println(harfler.headMap("M")); // {A=30, B=30, C=50, E=50, K=20}

        // Java'da islemler baslangic index'leri dahil, bitis index'leri haric olarak yapilir
        // TreeMap bu konuda da bize bir alternatif daha sunmus

        System.out.println(harfler.tailMap("K", false)); // {M=34, U=80, Z=80}
        System.out.println(harfler.headMap("M",true)); // {A=30, B=30, C=50, E=50, K=20, M=34}





    }
}
