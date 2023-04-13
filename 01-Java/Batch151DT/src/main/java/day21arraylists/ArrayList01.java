package day21arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");
        System.out.println(cities);//[Miami, Giresun, Yozgat, Barcelona, Miami, Giresun, Giresun, Yozgat]

        //ArrayList'te bir elemanin ilk gorunumu nasil silinir?
        //remove() methodu bir elemanin ilk gorunumunu siler
        System.out.println(cities.remove("Miami"));//true
        System.out.println(cities);//[Giresun, Yozgat, Barcelona, Miami, Giresun, Giresun, Yozgat]

        //Arraylist te bir eleman indexi kullanarak nasil silinir?
        System.out.println(cities.remove(2));//Barcelona
        System.out.println(cities);

        //remove() methodu eleman ile kullanilirsa ilk gorunumu siler
        //remove() methodu eleman ile kullanilirsa size o elemani silip silmedigini ifade eden true yada false verir

        //Example 1: Bir Integer list olusturun ve 12 elemanini siliniz.
        //Arraylist olustururken sag tarafa (constructor) Arraylist yazmak zorundasiniz
        //Ama sol tarafa ister Arraylist yazin ister List yazin ikiside calisir
        //Detaylari Collections konusunda gorecegiz

        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

//        ages.remove(12);
//        System.out.println(ages);
        //1 yol
//        Integer nonPrimitive = 12;
//        ages.remove(nonPrimitive);
//        System.out.println(ages);

        //2 yol Recommended
        ages.remove((Integer) 12);
        System.out.println(ages);
        //3 yol
//        ages.remove(ages.indexOf(12));
//        System.out.println(ages);

        //Kisa yoldan bir list olusturmak icin List.of() methodunun kullanabiliriz
        //List.of methodu degistirilemez bir liste olusturmak icin kullanilir
        //bu method ile olusturulan list degistirmeye yonelik methodlari desteklemez

        List<Character> initials = List.of('a','b','a','c','d','a');
        System.out.println(initials);//[a, b, c, d]
        // initials.add('e');
        //initials.remove(0);
        //initials.set(0,'u');
        System.out.println(initials);//[a, b, c, d]

        //indexOf(aranan karakter) methodu aranan karakterin ilk gorunumunun indexini verir
         int r1= initials.indexOf('c');
        System.out.println(r1);

        //lastIndexOf() methodu aranan karakterin son gorunumunun indexini verir.
        int r2 =initials.lastIndexOf('a');
        System.out.println(r2);

        //Example 2: Bir listteki tekrarsiz elemanlari console a yazdiriniz

        List<Double> prices = List.of(2.5, 2.5, 3.75);

                                //2.5, 2.5, 3.75
        for ( Double w : prices ) {

            if(prices.indexOf(w)==prices.lastIndexOf(w)){
            System.out.print(w+" ");//3.75 4.0

            }
        }
        System.out.println();

        //Example 3: Bir list te tekrarli eleman olup olmadigini gosteren kodu yaziniz
        List<Integer> heights = List.of(3,13,3);

        int counter=0;

        for ( Integer w :   heights ) {

            if(heights.indexOf(w) != heights.lastIndexOf(w) ){
                counter++;
            }
        }
        if(counter==0){
            System.out.println("All elements are unique in the list");
        }else{
            System.out.println("At least one element is not unique in the list");
        }























    }
}
