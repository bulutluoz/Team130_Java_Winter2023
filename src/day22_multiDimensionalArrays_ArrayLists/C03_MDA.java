package day22_multiDimensionalArrays_ArrayLists;

import java.util.Arrays;

public class C03_MDA {
    public static void main(String[] args) {

        //Soru 2- Verilen 2 katli bir array’de
        //        ayni index’e sahip elementleri toplayip,
        //        yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //		input :      int[][] arr =  {{3,4,5}, {2,3,6,7,8},{1,2,3},{2,4}};
        //	    output:                       [5, 7, 11]

        // output array'i kisa inner array'in uzunluguna esit olacak
        // inner array sayisini dinamik olacak sekilde dusunelim


        int[][] arr =  {{3,4,5}, {2,3,6,7,8},{1,2,3},{2,4,1}};

        // output'un uzunlugu en kisa array'in uzunluguna esit olacak
        // o zaman once en kisa inner arayin uzunlugunu bulalim

        int enKisaInnerlength = arr[0].length;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length < enKisaInnerlength){

                enKisaInnerlength = arr[i].length;
            }
        }

        int[] output = new int[enKisaInnerlength];


        for (int i = 0; i < output.length ; i++) { // output'un icine konacak index

            for (int j = 0; j < arr.length ; j++) { // arr'deki herbir inner array'in elementini bulacak

                output[i] += arr[j][i];
            }

        }

        System.out.println(Arrays.toString(output));
    }
}
