package day30_timeDate_varargs;

public class C06_Varargs {

    public static void main(String[] args) {

        islemYap("Ali","Veli","Sahil","Saido"); // 6
        islemYap("Meltem"); // 6
        islemYap("Orkong","Yakup","Sedat","Eren"); // 6 + 3 =9

    }

    public static void islemYap(String s, String... t){

        System.out.println(s.length() + t.length);
    }
}
