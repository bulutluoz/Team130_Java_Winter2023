package day03_scanner_dataCasting;

public class C04_Datacasting {

    public static void main(String[] args) {

        int sayiInt = 20;
        short sayiShort = 34;
        double sayiDouble = 22;
        String str = "Java";
        char chr = 'K';
        boolean bl = true;

        // bir data turundeki variable'a
        // baska data turunden deger atanabilir mi ?

        // String abc = sayiInt;
        // String abc = bl;
        // String abc = chr ;

        // char c = str;
        // char c = bl;
        // char c = sayiInt;  ?

        double dbl = sayiInt;
        dbl = sayiShort;
        dbl = chr ;
        // dbl = str;
        // dbl = bl ;


        // int in = sayiDouble;
        int in = sayiShort;
        in = chr;


        // short shrt = sayiDouble;
        // short shrt = sayiInt;
        // short shrt = chr;

    }
}
