package Java_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Collections_Theory {

    public static void main(String[] args) {
        hashSet();
    }

    public static void Array() {

        //Array : Only store or allowed homogeneous data (same data type)
        //Heterogeneous data : various data types

        String a[] = new String[2];
        //Why we need to create object ? :: Creating an object because arrays in Java are objects
        // Why is new required here? :: The keyword new is used to allocate memory on the heap for the array object.
        // Java does not automatically allocate memory just by declaring the reference variable (String a[]);
        // You must explicitly create the array with a size using new.

        a[0] = "Akshay";
        a[1] = "Sanjay";
        System.out.println(Arrays.toString(a));

        //Overcome above problem with object array
        Object o[] = new Object[2];
        o[0] = "Akshay";
        o[1] = 40;
        System.out.println(Arrays.toString(o));

        int b[] = {10, 20};

        //Explain this line of code ?
//       int b[]; Declares an array named b that can hold integers.
//       {10, 20} Initializes the array with the values 10 and 20.

        System.out.println(Arrays.toString(b));
    }

    public static void ArrayList() {

        // ArrayList :: 
        //One type of class present in java 
        //Package: java.util
        // Allows duplicate elements
        // Maintains insertion order of elements
        //List is interface and ArrayList is one of the class present in List (Collection >List >Arraylist, LinkedList etc.)
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        System.out.println("ArrayList: " + arrayList);
        System.out.println(arrayList.size());

        for (String arraylist : arrayList) {
            System.out.println(arraylist);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static void hashSet() {

        // HashSet:
        // Child class of collecion
        //Package: java.util
        // Does not allow duplicate elements
        // Does not maintain insertion order
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple");  //Duplicate won't be added
        hashSet.add("fruits"); //Order or does not follow any form of indexing
        hashSet.add("Grepps");

        System.out.println("HashSet: " + hashSet);
        System.out.println(hashSet.size());

        for (String hashset : hashSet) {
            System.out.println(hashset);
        }
    }

    public static void HashMap() {

        // HashMap ::
        // One type of class present in Java
        // Package: java.util
        // Stores data in key-value pairs
        // Keys must be unique :: Values can be duplicate
        // Does not maintain insertion order (use LinkedHashMap if order is needed)
        // Map is an interface and HashMap is one of the classes that implements Map (Collection > Map > HashMap, TreeMap, LinkedHashMap, etc.)
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 3);
        hashMap.put("Done", 4);

        System.out.println("HashMap: " + hashMap);
        System.out.println(hashMap.size());
    }

    public static void practice() {

        StringBuffer sb = new StringBuffer();
        sb.append("StringBuffer1 " + "StringBuffer2 " + "StringBuffer3 " + "StringBuffer4 ");

        List<String> list = new ArrayList<>();

        String[] parts = sb.toString().split(" ");

        for (String part : parts) {
            list.add(part);
        }

        System.out.println(list);
    }

    public static void loop() {

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void Other() {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(20);
        arrayList.add(40);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static void hashMapListExample() {
        // HashMapList Example
        ArrayList<HashMap<String, String>> hashMapList = new ArrayList<>();

        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();

        map1.put("Akshay", "Zankat");
        map1.put("Sanjay", "Zankat");

        map2.put("Rohit", "Sharma");
        map2.put("Virat", "Kohli");

        hashMapList.add(map1);
        hashMapList.add(map2);

        System.out.println(hashMapList);

        for (var HashMapList : hashMapList) {
            System.out.println(HashMapList);
        }
    }

//Collections : Group of object
//Why need Collections : 
//Clear comparison of the differences between ArrayList, HashSet, and HashMap
// | Feature           | ArrayList             | HashSet         | HashMap                    |
// | ----------------- | --------------------- | --------------- | -------------------------- |
// | Type              | List                  | Set             | Map                        |
// | Stores            | Elements              | Unique elements | Key-value pairs            |
// | Allows Duplicates | Yes                   | No              | Keys: No, Values: Yes      |
// | Maintains Order   | Yes (insertion order) | No              | No (unless LinkedHashMap)  |
// | Access by Index   | Yes                   | No              | No (access by key instead) |
}
