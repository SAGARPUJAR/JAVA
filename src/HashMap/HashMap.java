package HashMap;

import java.util.Iterator;

public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<String,String> stringHashMap=new java.util.HashMap<>();
        stringHashMap.put("Name","Sagar");
        stringHashMap.put("RegNumber","2347020");
        stringHashMap.put("Class","1 MSc CSA");

        /*Displaying Details*/

        /*1. Unsorted  Details  : Iterator with Entry Set*/
        System.out.println("Unsorted values : ");
        Iterator iterator=stringHashMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("---------------------------------------------------------------------------------------");
        /*2. Iterator with KeySet*/
        System.out.println("Key Sets : ");
        Iterator it=stringHashMap.keySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("---------------------------------------------------------------------------------------");
        /*Sorted List*/
        /*3. Sorted List, Iterator with KeySet*/
        System.out.println("Sorted Values : ");
        Iterator it1=stringHashMap.values().iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Loop With Values : ");
        for (String value : stringHashMap.values()){
            System.out.println(value);
        }
    }
}
