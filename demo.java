package HW9;

import java.util.Map;

public class demo {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println("Added elements");
        for(int i=1; i<=7; i++) {
            list.add(i + "-element");
        }
        System.out.println(list);
        System.out.println("Size = " + list.size());
        list.remove(2);
        System.out.println("Deleted third element");
        System.out.println(list);
        list.remove(0);
        System.out.println("Deleted first element");
        System.out.println(list);
        list.remove(list.size()-1);
        System.out.println("Deleted last element");
        System.out.println(list);
        System.out.println("Size = " + list.size());
        list.add("Added new element");
        System.out.println(list);
        System.out.println(list.get(list.size()-1));
        System.out.println("Size = " + list.size());
        list.clear();
        System.out.println("Clined up");
        System.out.println("Size = " + list.size());
        System.out.println(list);
//        System.out.println(list.get(0)); // call to a non-existent element

        MyLinkedList <String> stringList = new MyLinkedList<>();
        System.out.println("\nForming linked list");
        stringList.add("first go");
        stringList.add("second go");
        stringList.add("third go");
        stringList.add("fourth go");
        stringList.add("fifth go");
        stringList.add("sixth go");
        for (int i=0; i< stringList.size(); i++) {
            System.out.print(stringList.get(i) + " ");
        }
        stringList.remove(2);
        System.out.println("\nRemove third element");
        for (int i=0; i< stringList.size(); i++) {
            System.out.print(stringList.get(i) + " ");
        }
        stringList.remove(0);
        System.out.println("\nRemove first element");
        for (int i=0; i< stringList.size(); i++) {
            System.out.print(stringList.get(i) + " ");
        }
        stringList.remove(stringList.size()-1);
        System.out.println("\nRemove last element");
        for (int i=0; i< stringList.size(); i++) {
            System.out.print(stringList.get(i) + " ");
        }
        System.out.println("\nSize list = " + stringList.size());
        stringList.clear();
        System.out.println("After cleaning size list = " + stringList.size());

        System.out.println("\nCheckin hashmap. Let's go");
        MyHashMap<String, String> myMap = new MyHashMap<>();
        myMap.put("6", "PrivatBank");
        myMap.put("16", "Pireus Bank");
        myMap.put("3", "Raiffeisen");
        myMap.put("9", "Oshadbank");
        myMap.put("1", "UkrSibBank");
        myMap.put("2", "Credi Agricol Bank");
        myMap.put("5", "OTP Bank");
        myMap.put("7", "Procreditbank");
        myMap.put("12", "Universal Bank");
        myMap.put("10", "UkrEximBank");
        myMap.put("11", "UkrGasBank");
        myMap.put("8", "PUMB");
        myMap.put("13", "Pivdeniy");
        myMap.put("14", "Pravex Bank");
        myMap.put("15", "Sens Bank");
//        myMap.put("15", "Cunning Bank");       //Exception Double Key
        System.out.println("Put 15 pairs (Key, Value). Key '4' is absent");
        System.out.println("Size: " + myMap.size());
        System.out.println("Get the value by keys: 15, 4, 1, 16");
        System.out.println(myMap.get("15") + " " + myMap.get("4") + " " + myMap.get("1") + " " + myMap.get("16"));
        System.out.println("Removing on Key '15'");
        myMap.remove("15");
        System.out.println(myMap.get("15") + " " + myMap.get("4") + " " + myMap.get("1") + " " + myMap.get("16"));
        System.out.println("Size: " + myMap.size());
        System.out.println("And we'll clean everything");
        myMap.clear();
        System.out.println("Size: " + myMap.size());
        System.out.println(myMap.get("15") + " " + myMap.get("4") + " " + myMap.get("1") + " " + myMap.get("16"));
    }
}