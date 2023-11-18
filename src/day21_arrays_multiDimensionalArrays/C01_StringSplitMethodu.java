package day21_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C01_StringSplitMethodu {

    public static void main(String[] args) {

        String str = "java gun gectikce guzellesiyor";

        // cumleyi hic'likten parcalara ayirin
        System.out.println(Arrays.toString(str.split("")));
        //[j, a, v, a,  , g, u, n,  , g, e, c, t, i, k, c, e,  , g, u, z, e, l, l, e, s, i, y, o, r]

        // cumleyi "gec" metninden parcalara ayirin
        System.out.println(Arrays.toString(str.split("gec")));
        //[java gun , tikce guzellesiyor]


        // cumleyi kelimelere ayirin
        System.out.println(Arrays.toString(str.split(" ")));
        // [java, gun, gectikce, guzellesiyor]

        // e harflerinden str'i parcalara ayirin
        System.out.println(Arrays.toString(str.split("e")));
        // [java gun g, ctikc,  guz, ll, siyor]


        // verilen bir arama sonucunda
        // arama sonucunun 1000'den fazla oldugunu test edin

        String aramaSonucu = "1-48 of over 700 results for java";

        String[] kelimeler = aramaSonucu.split(" ");

        System.out.println(Arrays.toString(kelimeler));
        // [1-48, of, over, 5,000, results, for, java]

        String aramaSonucSayisiStr = kelimeler[3];  // 5,000

        aramaSonucSayisiStr = aramaSonucSayisiStr.replaceAll("\\D",""); // "5000"

        int aramaSonucSayisi = Integer.parseInt(aramaSonucSayisiStr); // int 5000


        if (aramaSonucSayisi > 1000){
            System.out.println("Arama sonuc sayisi testi PASSED");
        }else{
            System.out.println("Arama sonuc sayisi testi FAILED");
        }



    }
}
