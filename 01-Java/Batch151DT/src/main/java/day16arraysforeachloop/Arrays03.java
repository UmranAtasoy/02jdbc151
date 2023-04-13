package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {
        //Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz
         // 1 YOL
        String names [] = {"K","C","R","A","S"};
        String el ="A";

        int counter=0;
        for (String w : names ) {

            if(w.equals(el)){

                counter++;
                break;
            }
        }
        if(counter>0){
            System.out.println("Array has ==>" + el );
        }else {
            System.out.println("Array does not have ==> "+ el);
        }

        //2 YOL
        Arrays.sort(names); //  A C K R S
        int result = Arrays.binarySearch( names  ,   el );
        System.out.println(result);

        if(result<0){
            System.out.println("Array does not have ==> "+ el);
        }else{
            System.out.println("Array has ==>" + el );
        }

        //1) binarysearch() methodunu sort() kullanmadan kullanamayiz, cunku binarysearch() mantigi sirali elemanlar icin gecerlidir
        //2) binarysearch() methodu var olan elemanlar icin size o elemanin index inin verir
        //3) binarysearch() methodundan aldigimiz index 0 veya 0 dan buyuk ise bu aradigimiz eleman arrayde var demektir
        //4) binarysearch() methodu olmayan elemanlar icin negatif deger verir
        //      "-" isaretinin anlami o eleman arrayde yok demektir
        //      "-" isaretinin yanindaki sayi ise eger o eleman arrayda olsaydi kacinci eleman olurdu demektir


    }
}
