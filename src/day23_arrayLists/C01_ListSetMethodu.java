package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_ListSetMethodu {

    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();

        harfler.add("J");
        harfler.add("a");
        harfler.add("v");
        harfler.add("a");

        System.out.println(harfler); // [J, a, v, a]

        // v ile sonraki a arasina "b" ekleyelim

        harfler.add(3,"b");

        System.out.println(harfler); // [J, a, v, b, a]

        // b ile sonraki a arasina "c" ekleyin

        harfler.add(4,"c");

        System.out.println(harfler); // [J, a, v, b, c, a]

        // c harfini b olarak update edin (degistirin)

        harfler.set(4,"b");

        System.out.println(harfler); // [J, a, v, b, b, a]

        harfler.add(3,"k");

        System.out.println(harfler); // [J, a, v, k, b, b, a]

        System.out.println(harfler.set(3, "l")); // k

        System.out.println(harfler); // [J, a, v, l, b, b, a]




    }
}
