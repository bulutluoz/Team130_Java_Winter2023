package day20_arrays;

import day19_arrays.C02_ArrayinElemanlariniArtirma;

import java.util.Arrays;
import java.util.Scanner;

public class C01_KullaniciyaArrayOlusturtma {

    public static void main(String[] args) {

        //Soru 5- Kullanicidan array’in boyutunu ve tamsayi elementlerini alip
        //        array’i olusturan ve bize donduren bir method olusturun.


        // System.out.println("ilk array : "+ Arrays.toString(arrayOlustur()));



        int[] benimArray = arrayOlustur();

        System.out.println("Benim array : "+ Arrays.toString(benimArray));


        // benim array'imdeki tum sayilari 4 artirin

        benimArray = C02_ArrayinElemanlariniArtirma.elemanlariArtir(benimArray,4);


        System.out.println("Benim array : "+ Arrays.toString(benimArray));
    }


    public static int[] arrayOlustur(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen array'e kac eleman koyacaginizi giriniz");

        int elemanSayisi = scanner.nextInt();

        int[] arr = new int[elemanSayisi];

        for (int i = 0; i < arr.length ; i++) {

            System.out.println("Array'e eklemek icin bir tamsayi giriniz");
            arr[i] = scanner.nextInt();

        }

        return arr;

    }
}
