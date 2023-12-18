package day41_exceptions_collections;

import java.io.IOException;

public class C01_Exceptions {

    public static void main (String[] args)  {

        int sayi = 11;
        // eger sayi negatifse sadece 1.satir calissin, sonra
        // 5. satirdan sonra normal calismaya devam etsin
        // sayi cift ise 1.2. satir calissin sonra
        // 5. satirdan sonra normal calismaya devam etsin
        // diger durumlarda 5 satirda calissin


        try {
            System.out.println("satir1");
            if (sayi<0) throw new IllegalArgumentException();
            System.out.println("satir2");
            if (sayi % 2 == 0) throw new RuntimeException();
            System.out.println("satir3");
            System.out.println("satir4");
            System.out.println("satir5");
        } catch (IllegalArgumentException e) {
            System.out.println("Sayi negatif oldugundan 2,3,4,5 atlandi");
        }catch (RuntimeException e){
            System.out.println("sayi cift oldugu icin 3,4,5 atlandi");
        }
        System.out.println("buradan itibaren calismaya devam");
    }
}
