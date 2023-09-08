package HW9;

public class demo {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println("Added elements");
        for(int i=1; i<=7; i++) {
            list.add(i + " element");
            System.out.println(list.get(i-1));
        }
        System.out.println("Size = " + list.size());
        list.remove(2);
        System.out.println("Deleted third element");
        for(int i=0; i< list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove(0);
        System.out.println("Deleted first element");
        for(int i=0; i< list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove(list.size()-1);
        System.out.println("Deleted last element");
        for(int i=0; i< list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Size = " + list.size());
        list.add("Added new element");
        System.out.println(list.get(list.size()-1));
        System.out.println("Size = " + list.size());
        list.clear();
        System.out.println("Clined up");
        System.out.println("Size = " + list.size());
//        System.out.println(list.get(0)); // call to a non-existent element

    }
}