package day45_Maps_THE_END;

import java.util.HashMap;
import java.util.Map;

public class C04_HarfKullanimSayilariCompute {

    public static void main(String[] args) {
        //Soru : Verilen bir array’de kullanilan harfleri ve kacar defa kullanildigini yazdirin.
        //
        //Input : {a,b,c,d,e,c,d,b,e,a,c,b,d,a}
        //output :  a kullanimi : 3 adet   a=3
        //	        b kullanimi : 3 adet   b=3
        //	        c kullanimi : 3 adet   c=3
        //	        d kullanimi : 3 adet   d=3
        //	        e kullanimi : 2 adet   e=2

        String[] harfler = {"a","b","c","d","e","c","d","b","e","a","c","b","d","a"};

        // bir map olusturalim, key harfler, value ise kullanim adedi olsun

        Map<String,Integer> harfKullanimMapi = new HashMap<>();

        for (String each : harfler
             ) {

            harfKullanimMapi.computeIfPresent(each, (k,v)-> v+1); // harf map'de varsa

            harfKullanimMapi.computeIfAbsent(each,v->1);
        }

        System.out.println(harfKullanimMapi); // {a=3, b=3, c=3, d=3, e=2}
    }





}
