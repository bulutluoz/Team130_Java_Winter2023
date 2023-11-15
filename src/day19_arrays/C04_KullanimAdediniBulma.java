package day19_arrays;

public class C04_KullanimAdediniBulma {

    public static void main(String[] args) {
        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        //        ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        String[] harfler = {"a","c","r","s","a","a","s","k","a"};

        String arananHarf = "m";

        int sayac = 0;

        for (int i = 0; i < harfler.length ; i++) {

            if (harfler[i].equals(arananHarf)){
                sayac++;
            }
        }

        if (sayac == 0){
            System.out.println("Verilen " + arananHarf + " harfi array'de yok");
        }else {
            System.out.println("Verilen " + arananHarf + " harfi array'de " + sayac + " kere kullanilmis");
        }

    }

    public static void elemanArama(String[] arr , String arananEleman){

        int sayac = 0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i].equals(arananEleman)){
                sayac++;
            }
        }

        if (sayac == 0){
            System.out.println("Istenen eleman " + arananEleman + " harfi array'de yok");
        }else {
            System.out.println("Istenen eleman " + arananEleman + ", array'de " + sayac + " kere kullanilmis");
        }
    }
}
