package day19_arrays;

import day18_scope.C03_Scope_ClassVariableKullanim;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        int[] sayilar = {3,-5,4,6,-2,9,1};


        // sayilar array'indeki tum sayilari 3 artirip, kaydedin

        sayilar = C02_ArrayinElemanlariniArtirma.elemanlariArtir(sayilar,3);

        System.out.println(Arrays.toString(sayilar)); // [6, -2, 7, 9, 1, 12, 4]

        // sayilar array'inin yeni halinde pozitif elementlerinin toplamini yazdirin

        System.out.println("pozitif elementlerin toplami : "+ C03_pozitifSayilariToplama.pozitifElementleriTopla(sayilar));
    }
}
