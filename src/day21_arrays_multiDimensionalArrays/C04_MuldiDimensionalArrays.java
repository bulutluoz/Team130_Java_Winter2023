package day21_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C04_MuldiDimensionalArrays {

    public static void main(String[] args) {

        int[][] arr = {{3,4,5},{9,10},{7},{1,2,3,4,5,6}};

        System.out.println(Arrays.toString(arr[0])); // [3, 4, 5]

        System.out.println(arr[3][3]); // 4

        System.out.println(Arrays.toString(arr[2])); // [7]

        System.out.println(arr[2][0]); // 7

        // 10 elementinin yerine deger olarak 5 atayin

        arr[1][1] = 5;

        // 6 elementinin yerine deger olarak 8 atayin desem

        arr[3][5] = 8 ;

        // tum array'i yazdirin

        System.out.println(Arrays.deepToString(arr));
        // [[3, 4, 5], [9, 5], [7], [1, 2, 3, 4, 5, 8]]


        // 1 indexdeki inner array'in 1.indexdeki elementinin degerini
        // dinamik olarak 3 artirin

        arr[1][1] += 3;

        System.out.println(Arrays.deepToString(arr));
        // [[3, 4, 5], [9, 8], [7], [1, 2, 3, 4, 5, 8]]
    }
}
