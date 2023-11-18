package day21_arrays_multiDimensionalArrays;

public class C05_MDA_tumElementleriGozdenGecirme {

    public static void main(String[] args) {

        // verilen bir array'de cift sayilarin toplamini yazdirin

        int[] arrT = {3,4,6,9,0,2,5,6,8,1};

        int toplam = 0;

        for (int i = 0; i < arrT.length ; i++) {

            if (arrT[i] % 2 == 0){

                toplam += arrT[i] ;
            }
        }

        System.out.println(toplam); // 26


        int[][] arrIki = {{3,4,6},{9,0},{2,5,6,8,1}};

        // iki katli bu array'de cift sayilarin toplamini yazdirin

        toplam =0;

        for (int i = 0; i < arrIki.length ; i++) { // inner array'leri kontrol eder yani ilk []

            for (int j = 0; j <arrIki[i].length ; j++) { // inner array'deki elementleri kontrol eder, yani ikinci []

                if (arrIki[i][j] % 2 == 0){
                    toplam += arrIki[i][j];
                }
            }
        }

        System.out.println(toplam);

    }
}
