package day21_arrays_multiDimensionalArrays;

public class C02_StringSplitMethodu {

    public static void main(String[] args) {

        // Verilen bir metin'de
        // istenen karakterin kac kere kullanildigini yazdirin

        String metin = "Java da hergun yeni seyler ogreniyoruz";

        String arananKarakter = "a";



        String[] karakterler = metin.split("");
        int sayac = 0;

        for (int i = 0; i < karakterler.length ; i++) {

            if (karakterler[i] .equals(arananKarakter)){
                sayac++;
            }
        }

        System.out.println("Aradiginiz karakter metinde " + sayac + " defa kullanilmis");
    }
}
