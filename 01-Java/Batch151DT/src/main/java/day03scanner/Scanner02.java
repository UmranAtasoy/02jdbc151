package day03scanner;

import java.util.Scanner;

public class Scanner02 {
    //Kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdiriniz
    public static void main(String[] args) {

        //1.Adim : Scanner Class'dan object olustur
        Scanner input = new Scanner(System.in);

        //2. Adim :Kullaniciya ne istedigimize dair mesaj veriniz
        System.out.println("Ilk isminizi giriniz...");
        String firstName = input.next();

        System.out.println("Soy isminizi giriniz...");
        String  lastName = input.next();

        System.out.println(firstName +" " +lastName);




    }


}
