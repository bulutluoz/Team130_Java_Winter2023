package day05_concatenation_operatorler;

public class C02_KarsilastirmaOperatorleri {

    public static void main(String[] args) {

        int a = 20;

        int b = 25;

        b = a;


        a = 2 * a + 5;


        System.out.println( a == b); // a b'ye esit mi ?  ==> false


        System.out.println( b = b + 3 ); // 23


        System.out.println(b); // 23

        System.out.println( b + 27 == a + 5); // true


        System.out.println( a != b ); // a b'ye esit degildir. dogru mu ?  true

        System.out.println(!false); // true

        System.out.println(4 > 7); // false

        System.out.println( 5 > 3 == 6 > 7 ); // false

        System.out.println( !(4 > 5) );  // true



    }
}
