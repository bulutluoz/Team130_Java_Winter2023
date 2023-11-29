package day29_immutableClasses;

public class C04_Immutable_AtamaIslemi {

    public static void main(String[] args) {

        String isim = "Sedat";

        isim= isim.concat(" Yaman");

        System.out.println(isim); // Sedat Yaman

        isim = isim.toUpperCase();


        // 18.satirdan itibaren, 26.satira kadar
        // Java kac tane obje olusturur ? Cevap : 101
        String str = "a";

        for (int i = 1; i <=100 ; i++) {

            str += "a";
        }

        System.out.println(str);
    }
}
