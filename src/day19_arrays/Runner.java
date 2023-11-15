package day19_arrays;

import day18_scope.C03_Scope_ClassVariableKullanim;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        int[] sayilar = {3,-5,4,6,-2,9,1};
        String[] isimler = {"ali","veli","saido","sahil","ali","saido","mehmet"};


        // sayilar array'indeki tum sayilari 3 artirip, kaydedin

        sayilar = C02_ArrayinElemanlariniArtirma.elemanlariArtir(sayilar,3);

        System.out.println(Arrays.toString(sayilar)); // [6, -2, 7, 9, 1, 12, 4]

        // sayilar array'inin yeni halinde pozitif elementlerinin toplamini yazdirin

        System.out.println("pozitif elementlerin toplami : "+ C03_pozitifSayilariToplama.pozitifElementleriTopla(sayilar));


        // isimler array'inde mehmet ismi kac kere kullanilmis, yazdirin
        C04_KullanimAdediniBulma.elemanArama(isimler,"mehmet");
        // Istenen eleman mehmet, array'de 1 kere kullanilmis


        // isimler array'inde ali ismi kac kere kullanilmis, yazdirin
        C04_KullanimAdediniBulma.elemanArama(isimler,"ali");
        //Istenen eleman ali, array'de 2 kere kullanilmis


    }
}
