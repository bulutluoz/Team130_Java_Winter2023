package day30_timeDate_varargs;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.TemporalUnit;

public class C01_LocalTime {

    public static void main(String[] args) {

        LocalTime saat = LocalTime.now();

        LocalTime saatUsa = LocalTime.now(ZoneId.of("America/New_York"));

        System.out.println("Newyork saati : " + saatUsa);
        // Newyork saati : 12:44:14.422897

        System.out.println(saat.plusHours(10000)); // 10:47:54.694969
        System.out.println(saat.minusHours(3)
                                .minusSeconds(23)
                                .minusMinutes(15)); // 15:33:28.190958

        System.out.println(saat.withMinute(27).withSecond(15)); // 18:27:15.709003

        System.out.println(saat.withSecond(0).withNano(0)); // 18:51

        System.out.println(saat.toNanoOfDay()); // 67957646925000
        // gece 00:00' dan baslayarak saat'in olusturuldugu ana kadar gecen nanosaniye


        LocalTime saat1 = LocalTime.of(10,45);
        LocalTime saat2 = LocalTime.of(14,12,23);

        System.out.println(saat1.isBefore(saat2)); // true
        System.out.println(saat1.isAfter(saat2)); // false


    }
}
