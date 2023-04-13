package day20methodoverloadingarraylist;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists01 {

    public static void main(String[] args) {

        //ArrayList nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<Integer>();

        //ArrayList console a nasil yazdirilir?
        System.out.println(ages);//[]

        //Arraylistlere eleman nasil eklenir?
        //Arrayliste eleman eklemek icin add() methodunu kullaniriz
        //add() methodu elemanlari sizin verdiginiz sirada liste ekler (==>insertion order)
        ages.add(9);
        ages.add(12);
        ages.add(10);
        System.out.println(ages);//[9, 12, 10]
        ages.add(1,656);
        System.out.println(ages);//[9, 656, 12, 10]
        ages.add(3,777);
        System.out.println(ages);//[9, 656, 12, 777, 10]
        ages.add(888);
        System.out.println(ages);//[9, 656, 12, 777, 10, 888]

        //List'e coklu eleman nasil eklenir? veya Liste baska bir list nasil eklenir?
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        System.out.println(ages);//[9, 656, 12, 777, 10, 888, 8, 9, 10]

        ages.addAll(2,newAges);
        System.out.println(ages);//[9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]

        //Arraylistte eleman sayisi nasil bulunur?
        //size() methodu bir listteki eleman sayisini bize verir
         int numOfElement = ages.size();
        System.out.println(numOfElement);//12

        //Arraylist te specific bir eleman nasil alinir
        //get() methodu index kullanarak istedigimiz elemani almaya yarar
        int el1 = ages.get(1);
        System.out.println(el1);//656

        //Arraylistte specific bir eleman nasil degistirilir?
        ages.set(2,313);
        System.out.println(ages);

        ages.set(4,353);
        System.out.println(ages);

        //Bir listteki tum elemanlari nasil silebiliriz?
//        ages.clear();
//        System.out.println(ages);

        //Arraylistte specific bir elemanin var olup olmadigini nasil anlariz?
        boolean r = ages.contains(656);
        System.out.println(r);

        //Bir Arraylistin bos olup olmadigini nasil kontrol ederiz?
        //isEmpty() methodu Arraylist bos ise true bos degilse false return eder
        boolean r2 = ages.isEmpty();
        System.out.println(r2);

        ages.clear();

        boolean r3 = ages.isEmpty();
        System.out.println(r3);

        //Example 1: Bir listin bos olup olmadigini kontrol eden kodu yaziniz
        ArrayList<String> names = new ArrayList<>();
        names.add("usame");
        names.add("fatih");
        names.add("ali");
        names.add("ufuk");

        //1 way burada iki is var
        if(names.size()==0){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }

        names.clear();

        //2 way Recommended
        if(names.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }
        //Bir listin baska bir list ile ayni olup olmadigini nasil kontrol ederiz?
        //iki listin esit olabilmesi icin ayni index de ayni elemanlar olmalidir
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("usame");
        names1.add("fatih");
        names1.add("ufuk");
        names1.add("ali");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("usame");
        names2.add("fatih");
        names2.add("ufuk");
        names2.add("ali");

        boolean s =names1.equals(names2);
        System.out.println(s);

        //verilen iki integer listte tamamiyla ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);
        Collections.sort(nums2);
        System.out.println(nums1.equals(nums2));//true






















    }

}
