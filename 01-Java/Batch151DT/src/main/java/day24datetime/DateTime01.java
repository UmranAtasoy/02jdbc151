package day24datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {

    public static void main(String[] args) {

        //Icinde bulundugumuz zaman dilimindeki tarihi verir
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);//2023-03-21

        //Tarih ten istedigimiz bilesin nasil aliriz?
        int monthValue = myCurrentDate.getMonthValue();
        System.out.println(monthValue);//3

        int yearValue = myCurrentDate.getYear();
        System.out.println(yearValue);//2023

        int dayValue = myCurrentDate.getDayOfMonth();
        System.out.println(dayValue);//21

        //Month bir Enum dir.
        //Enum, java da sabit degerleri (Ay isimleri, Gun isimleri, Ulkedeki sehir isimleri) depolamak icin kullanilir
        Month monthName = myCurrentDate.getMonth();
        System.out.println(monthName);//MARCH

        DayOfWeek dayName = myCurrentDate.getDayOfWeek();
        System.out.println(dayName);//TUESDAY

        //Ileriki tarihlere nasil gidilir?
        LocalDate newDate = myCurrentDate.plusDays(13).plusMonths(1).plusYears(2);//2025-05-03
        System.out.println(newDate);
        //gecmis tarihe nasil gidilir?
        System.out.println(newDate.minusYears(2).minusMonths(1).minusDays(13));

        //Specific bir tarih objesi nasil olusturulur
        LocalDate date1 = LocalDate.of(1980, 8, 10);
        LocalDate date2 = LocalDate.of(1985, 7, 19);

        //Bir tarihin baska bir tarihten sonra olup olmadigini nasil kontrol ederiz?
        boolean r1 = date1.isAfter(date2);
        System.out.println(r1);//false

        boolean r2 = date1.isBefore(date2);
        System.out.println(r2);//true

        boolean r3 = date1.isEqual(date2);
        System.out.println(r3);//false

        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz
        //          Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" mesaji veriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year, month, and day numbers in the given order");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year, month, day);

        if (givenDate.isBefore(LocalDate.now())) {
            System.out.println(givenDate + "  Invalid date");
        } else {
            System.out.println("Enter time for the ticket");
        }

        System.out.println("givenDate.lengthOfMonth() = " + givenDate.lengthOfMonth());//31

        //Example 2: Kullanicinin girdigi tarihin gun ismini bulan kodu yaziniz
        System.out.println("Please enter year, month, and day numbers in the given order");
        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        LocalDate date = LocalDate.of(y, m, d);
        System.out.println(date.getDayOfWeek());

    }
}
