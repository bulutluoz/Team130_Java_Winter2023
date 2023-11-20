package day22_multiDimensionalArrays_ArrayLists;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {

        int[][] arr =  {{3,1,2,4,6},{1,2},{3,4,5},{10},{2,7,1}};
        int toplam = 0;
        // Bu array'deki tum elementlerin toplamini yazdirin

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                toplam += arr[i][j] ;
            }
        }

        System.out.println("Tum elementlerin toplami : " + toplam);
        // Tum elementlerin toplami : 44

        //Soru 3- Verilen 2 katli bir array’de
        //        her bir ic array’deki elementleri toplayip,
        //        yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //	        input :      int[][] arr =  {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        //	        output:                       [10, 3, 12, 10, 9]

        int[] output = new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            toplam =0;
            for (int j = 0; j <arr[i].length ; j++) {

                toplam += arr[i][j];

            }
            output[i] = toplam;
        }

        System.out.println(Arrays.toString(output));

    }
}
