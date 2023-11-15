package day19_arrays;

public class C03_pozitifSayilariToplama {

    public static void main(String[] args) {

        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        //        sonucu bize donduren bir method yaziniz.

        int[] arr = {3,4,-1,-7,9,-4,1,3,-9};
        int toplam = 0;


        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] > 0){
                toplam += arr[i] ;
            }
        }

        System.out.println("Array'deki pozitif sayilarin toplami : " + toplam);

        System.out.println(pozitifElementleriTopla(arr));
    }


    public static int pozitifElementleriTopla(int[] arr){

        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] > 0 ){
                toplam += arr[i];
            }
        }
        return toplam;
    }
}
