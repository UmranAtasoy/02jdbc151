package day34collectionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

    public static void main(String[] args) {

        /*
        Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir
        "key" kismi tekrarsiz, "value" kismi tekrarli olabilir
        Maplerdek elemanlara "Entry" denir.
        Elemanlarin tamamina "EntrySet" denilir
        Entryler tekrarsiz oldugu icin EntrySet denilir
        "Key" ve Value lar ayri ayri data tiplerinde olabilirler
        "Map"ler collection degildir
        Hashmapler entryleri rastgele siralar, bu yuzden en hizli maptir
        */

        HashMap<String,Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Albania",3000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Turkey",83000000);
        countryPopulation.put("Netherland",1800000);
        //{Netherland=1800000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000}
        System.out.println(countryPopulation);

        //get() methodu key ile calisir ve value return eder
        int germanyPopulation = countryPopulation.get("Germany");
        System.out.println(germanyPopulation);//83000000

       Set<String> keys= countryPopulation.keySet();
        System.out.println(keys);//[Netherland, USA, Turkey, Germany, Albania]

        Collection<Integer> values = countryPopulation.values();
        System.out.println(values);//[1800000, 400000000, 83000000, 83000000, 3000000]


        //Example1:Countrypopulation mapindeki ulkelerin nufuslarinin ortalamasi nedir?

        Collection<Integer> value = countryPopulation.values();
        int sum =0;
        for (  Integer w :   value           ) {
            sum= sum+w;
        }
        System.out.println(sum/value.size());//114160000

        //entrySet() mapteki entryleri kalip halinde alip bize Set olarak veriyor
        //Looplar mapler ile kullanilamaz, bunun icin entryset methodunu kullaniriz

        Set<Map.Entry<String,Integer>> entries = countryPopulation.entrySet();
        System.out.println("entries = " + entries);
//[Netherland=1800000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000]
        //Example 2 : countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin toplamini bulunuz.


        int toplam =0;

        for ( Map.Entry<String,Integer>  w : entries ) {
            toplam = toplam +  w.getKey().length() + w.getValue();
        }
        System.out.println(toplam);//570800033

    }

}
