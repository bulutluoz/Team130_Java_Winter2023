package day21_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C06_TumElementleriArtirma {

    public static void main(String[] args) {

        // verilen iki katli bir int[] deki
        // tum sayilari 3 artirin

        int[][] arr = {{3,4,6},{9,0},{2,5,6,8,1}};

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                arr[i][j] += 3;

            }
        }

        System.out.println(Arrays.deepToString(arr));

        // [[6, 7, 9], [12, 3], [5, 8, 9, 11, 4]]
    }
}
