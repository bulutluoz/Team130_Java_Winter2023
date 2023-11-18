package day21_arrays_multiDimensionalArrays;

import day20_arrays.C04_ArrayeElementEkleme;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C03_ArrayeYeniDegerAtama {

    public static void main(String[] args) {

        // Var olan bir Array'e yeni deger atanabilir mi ?

        int[] arr1 = {3,5,6};

        // arr1 = {4,2,6};

        // once istedigimiz array'i ayri bir array olarak olusturur
        // sonra da bizim array'imize atama yapariz

        int[] geciciArr = {4,2,6};

        arr1 = geciciArr;
        System.out.println(Arrays.toString(arr1)); // [4, 2, 6]

        // eger yeni atadigimiz array default degerlerden olusan bir array olacaksa
        // new keyword kullanarak direk atama yapabiliriz

        arr1 = new int[5];

        System.out.println(Arrays.toString(arr1)); // [0, 0, 0, 0, 0]


        // Olusturulmus bir array'e uzunlugunu degistirecek sekilde
        // bir element eklemek veya element silmek mumkun mudur ?

        int[] sayilar = {4,2,1};

        // 4.element olarak 3 ekleyin

        // sayilar[3] = 3; // ArrayIndexOutOfBoundsException

        sayilar = C04_ArrayeElementEkleme.arrayElementEkle(sayilar,3);

        System.out.println(Arrays.toString(sayilar)); // [4, 2, 1, 3]

        // sayilar array'ine 5.element olarak 9 ekleyin

        sayilar = C04_ArrayeElementEkleme.arrayElementEkle(sayilar,9);

        System.out.println(Arrays.toString(sayilar)); // [4, 2, 1, 3, 9]

        // array'in ilk elementi olan 4'u arrayden silin
        // array'i 4 elementli hale getirin

        // var olan bir array'e uzunlugu degistirecek sekilde yeni element ekleyemeyiz
        // veya element silemeyiz
        // Bunun yerine istenen elementlere sahip yeni bir array olusturup
        // sonra yeni array'i eski array'e deger olarak atayabiliriz


        // once uzunlugu eski array'den 1 eksik olan yeni bir array olusturalim
        int[] yeniSayilar = new int[sayilar.length-1];
        // eski array'deki silinecek element disindaki elementleri
        // yeni array'e kopyalayalim

        for (int i = 0; i < yeniSayilar.length ; i++) {

            yeniSayilar[i] = sayilar[i+1];
        }

        sayilar = yeniSayilar;

        System.out.println(Arrays.toString(sayilar)); // [2, 1, 3, 9]

    }
}
