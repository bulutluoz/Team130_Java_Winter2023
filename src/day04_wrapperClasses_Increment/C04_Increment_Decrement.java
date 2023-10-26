package day04_wrapperClasses_Increment;

public class C04_Increment_Decrement {

    public static void main(String[] args) {

        int a = 10 ;

        // a'nin degerini olusturacagimiz bir b variable'na atayin
        // sonra a'nin degerini 1 artirin

        int b = a;

        a++;

        System.out.println("a : " + a + ", b : " + b); // a : 11, b : 10


        a= 10;

        // a'nin degerini bir artirin
        // sonra a'nin degerini b'ye atayin

        a++;

        b = a ;

        System.out.println("a : " + a + ", b : " + b); // a : 11, b : 11


        a= 10;

        // a'nin degerini yazdirin
        // sonra a'nin degerini 1 artirin

        System.out.println("a nin degeri : " + a); // 10

        a++ ;

        // burada a'nin degeri  : 11


        a= 10;

        // a'nin degerini 1 artirin
        // sonra a'nin degerini yazdirin

        a++;

        System.out.println("a nin degeri : " + a); // 11

        // burada a'nin degeri 11

    }
}
