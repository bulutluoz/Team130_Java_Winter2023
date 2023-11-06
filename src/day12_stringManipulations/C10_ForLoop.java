package day12_stringManipulations;

public class C10_ForLoop {

    public static void main(String[] args) {

        // Java'da baslangic ve bitis degeri belli olan
        // veya tekrar sayisi verilmis olan islemler icin
        // LOOP kullaniriz

        // 5 kere hello world yazdirin

        String str = "Hello World\n";

        System.out.println(str.repeat(5));

        // 1'den 10'a kadar olan sayilari tek tek yazdirin

        for (int i = 1; i <=10 ; i++) {

            System.out.print(i + " ");

        }


    }
}
