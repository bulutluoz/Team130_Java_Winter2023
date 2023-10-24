package day03_scanner_dataCasting;

public class C05_DataCasting {

    public static void main(String[] args) {
        // kucuk data turundeki degeri, buyuk data turundeki variable'a atamak isterseniz
        // java bunu otomatik olarak yapar, buna auto widening

        byte a = 15;

        short b = a ;

        int c = b ;

        long d = c ;

        double e = d ;

        // buyuk data turundeki degeri, kucuk data turundeki variable'a atamak istersek
        // java bunu otomatik olarak yapmaz, sorumlulugu almamizi ister
        // sorumluluk almak icin buyuk data turundeki degerin onune
        // parantez icinde cevirmek istedigimiz kucuk data turunu yazariz
        // explicit narrowing

        double f = 34.5;

        int g = (int)f ;

        short h = (short)g ;

        byte k = (byte)h;
    }
}
