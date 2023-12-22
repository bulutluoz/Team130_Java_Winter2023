package day45_Maps_THE_END;

import java.util.HashMap;
import java.util.Map;

public class C03_ComputeMethodlari {

    public static void main(String[] args) {


        Map<String,Integer> harfler = new HashMap<>();

        harfler.put("K",20);
        harfler.put("B",30);
        harfler.put("C",50);
        harfler.put("Z",80);

        System.out.println(harfler); // {B=30, C=50, Z=80, K=20}

        // K'nin degerini 2 katina cikarin

        int eskiDeger = harfler.get("K"); // 20
        harfler.put("K",2*eskiDeger);

        System.out.println(harfler); // {B=30, C=50, Z=80, K=40}

        // Eger map'de A yoksa value = 44 olarak A ekleyin

        if (!harfler.containsKey("A")){
            harfler.put("A",44);
        }

        System.out.println(harfler); // {A=44, B=30, C=50, Z=80, K=40}

        // Eger Z iceriyorsa value'sunu 10 artirin

        if (harfler.containsKey("Z")){
            eskiDeger = harfler.get("Z");
            harfler.put("Z", eskiDeger+10);
        }

        System.out.println(harfler); // {A=44, B=30, C=50, Z=90, K=40}


        // B'nin value'sunu 20 artirin

        harfler.compute("B",(k,v)-> v+20);

        System.out.println(harfler); // {A=44, B=50, C=50, Z=90, K=40}

        // C'nin degerini 3 katinin  10 eksigi yapin

        harfler.compute("C",(a,b)-> b*3-10);

        System.out.println(harfler); // {A=44, B=50, C=140, Z=90, K=40}

        // D'nin degerini 5 artir

        // harfler.compute("D",(k,v)-> v+5); // olmayan bir element kullanilirsa : NullPointerException

        // Eger key olarak D varsa degerini 5 artir

        System.out.println(harfler.computeIfPresent("D", (k, v) -> v + 5)); // null

        System.out.println(harfler); // {A=44, B=50, C=140, Z=90, K=40}

        // Eger key olarak B varsa degerini 5 artir

        harfler.computeIfPresent("B",(k,v)->v+5);

        System.out.println(harfler); // {A=44, B=55, C=140, Z=90, K=40}

        // Eger map'de T yoksa value = 20 olarak T ekleyin

        harfler.computeIfAbsent("T",v -> 20);

        System.out.println(harfler); // {A=44, B=55, C=140, T=20, Z=90, K=40}
    }
}
