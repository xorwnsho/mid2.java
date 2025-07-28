package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();

        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        System.out.println("addLast");
        list.add("addList", 3);
        System.out.println(list);

        System.out.println("addFirst");
        list.add("addFirst", 0);
        System.out.println(list);

        Object removed1 = list.remove(4);
        System.out.println("removed(4) = " + removed1);
        System.out.println(list);

        Object removed2 = list.remove(0);
        System.out.println("removed(0) = " + removed2);
        System.out.println(list);
    }

}
