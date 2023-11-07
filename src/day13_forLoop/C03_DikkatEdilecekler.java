package day13_forLoop;

public class C03_DikkatEdilecekler {

    public static void main(String[] args) {

        // Eger i'nin ilk degeri icin bile bitis sarti true olmazsa
        // loop body'si hic devreye girmez
        // LOOP CALISIR ama HIC BIR ISLEM YAPMAZ


        for (int i = 10; i >20 ; i++) {

            System.out.println("Bu loop body'si hic calismaz");
        }

        // EGER i'nin butun degerleri icin bitis sarti TRUE oluyorsa
        // bu duruma teknik olarak SONSUZ LOOP denir

        for (int i = 10; i >0 ; i++) {
            System.out.print(i + " ");
        }

    }
}
