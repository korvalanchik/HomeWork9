package HW9;

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

    }
}