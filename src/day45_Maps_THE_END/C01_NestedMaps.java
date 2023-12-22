package day45_Maps_THE_END;

import java.util.HashMap;
import java.util.Map;

public class C01_NestedMaps {

    public static void main(String[] args) {

      /*
       {
            "firstname" : "Ahmet",
            "lastname" : "Bulut",
            "totalprice" : 500,
            "depositpaid" : false,
            "bookingdates" : {
                   "checkin" : "2024-07-21",
                   "checkout" : "2024-08-10"
                      },
            "additionalneeds" : "wi-fi"
            }
       */

        // yukaridaki bilgileri bir map olarak olusturun

        Map< String , Object> bodyMap = new HashMap<>();
        bodyMap.put("firstname","Ahmet");
        bodyMap.put("lastname","Bulut");
        bodyMap.put("totalprice",500);
        bodyMap.put("depositpaid",false);

        Map<String,String> bookingdatesValueMap = new HashMap<>();
        bookingdatesValueMap.put("checkin","2024-07-21");
        bookingdatesValueMap.put("checkout","2024-08-10");

        bodyMap.put("bookingdates",bookingdatesValueMap);
        bodyMap.put("additionalneeds","wi-fi");


        System.out.println(bodyMap);
        /*
        {
        firstname=Ahmet,
        additionalneeds=wi-fi,
        bookingdates={
            checkin=2024-07-21,
            checkout=2024-08-10},
        totalprice=500,
        depositpaid=false,
        lastname=Bulut
        }
         */

        // olusturulan map'deki ismi yazdirin

        System.out.println(bodyMap.get("firstname")); // Ahmet

        // totalprice'i yazdirin

        System.out.println(bodyMap.get("totalprice"));

        // checkin tarihini yazdirin

        System.out.println(   ((Map<String,String>)bodyMap.get("bookingdates")).get("checkin")   );
        // 2024-07-21

        // firstname key'ine ait value'u Kaan yapin

        bodyMap.put("firstname","Kaan");

        // depositpaid key'ine ait value'yu true yapin

        bodyMap.put("depositpaid",true);

        // checkout tarihini 2024-08-21 yapin

        ((Map<String, String>) bodyMap.get("bookingdates")).put("checkout","2024-08-21");


        System.out.println(bodyMap);


        // value'lar arasinda Kaan diye bir value var mi ?

        System.out.println(bodyMap.containsValue("Kaan")); // true

        // value'ler arasinda "2024-08-21" var mi ?

        System.out.println(bodyMap.containsValue("2024-08-21")); // false

        // key'lerde name var mi ?

        System.out.println(bodyMap.containsKey("name")); // false

        // key'lerde additionalneeds var mi ?

        System.out.println(bodyMap.containsKey("additionalneeds")); // true


    }
}
