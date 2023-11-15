package day19_arrays;

import java.util.Arrays;

public class C02_ArrayinElemanlariniArtirma {

    public static void main(String[] args) {

        //Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip
        //        bize donduren bir method olusturun.
        //        Eski array’i yeni haliyle kaydedin.

        int[] arr = {5,1,7,9,2};

        // eger array'in tum elementlerini gozden gecirmeniz gerekiyorsa
        // bir for loop kullaniriz

        for (int i = 0; i < arr.length ; i++) {

            arr[i] = arr[i] + 2 ;

        }

        System.out.println(Arrays.toString(arr)); //  [7, 3, 9, 11, 4]


        arr = elemanlariArtir(arr,2);

        System.out.println(Arrays.toString(arr)); // [9, 5, 11, 13, 6]

        arr = elemanlariArtir(arr,5);

        System.out.println(Arrays.toString(arr)); // [14, 10, 16, 18, 11]

    }

    public static int[] elemanlariArtir(int[] arr , int artisMiktari){

        for (int i = 0; i < arr.length ; i++) {

            arr[i]  = arr[i] + artisMiktari ;
        }

        return arr;
    }
}
