package day45_Maps_THE_END;

import java.util.HashMap;
import java.util.Map;

public class C05_MapMethodlari {
    public static void main(String[] args) {

        Map<String,Integer> harfler = new HashMap<>();

        harfler.put("K",20);
        harfler.put("B",30);
        harfler.put("C",50);
        harfler.put("Z",80);

        System.out.println(harfler); // {B=30, C=50, Z=80, K=20}

        harfler.putIfAbsent("B", 20);

        System.out.println(harfler); // {B=30, C=50, Z=80, K=20}

        harfler.putIfAbsent("T", 20);

        System.out.println(harfler); // {B=30, C=50, T=20, Z=80, K=20}


        System.out.println(harfler.get("A")); // null

        System.out.println(harfler.getOrDefault("B", 0)); // 30

        System.out.println(harfler.getOrDefault("S", 10)); // 10

        System.out.println(harfler); // {B=30, C=50, T=20, Z=80, K=20}

        harfler.replace("B",40);
        // harfler.put("B",40);
        System.out.println(harfler); // {B=40, C=50, T=20, Z=80, K=20}

        System.out.println(harfler.replace("M", 30)); // null

        System.out.println(harfler); // {B=40, C=50, T=20, Z=80, K=20}
        // harfler.put("M",30);
        // eger replace yapilmak istenen key, map'de var ise
        // replace ile put ayni islevi gorur 35-36.satir
        // eger replace yapilmak istenen key, map'de yok ise
        // replace null dondurur ve map'e eklemez
        // put ise her durumda ekler

        harfler.replace("B", 40,50);

        System.out.println(harfler); // {B=50, C=50, T=20, Z=80, K=20}

        harfler.replace("B", 60,70);

        System.out.println(harfler); // {B=50, C=50, T=20, Z=80, K=20}



    }
}
