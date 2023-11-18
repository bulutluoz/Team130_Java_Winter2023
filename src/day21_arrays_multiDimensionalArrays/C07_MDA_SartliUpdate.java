package day21_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C07_MDA_SartliUpdate {

    public static void main(String[] args) {

        // verilen iki katli bir array'de
        // pozitif sayilarin degerini 3 azaltip
        // negatif sayilari degerini 4 artirin

        int[][] arr = {{4,-1,-5},{6,-9,2},{1,5,-8,-4,3,6}};

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j] > 0 ){

                    arr[i][j] -= 3;

                } else if (arr[i][j] < 0) {

                    arr[i][j] += 4;
                }
            }
        }

        System.out.println(Arrays.deepToString(arr));
        // [[1, 3, -1], [3, -5, -1], [-2, 2, -4, 0, 0, 3]]
    }
}
