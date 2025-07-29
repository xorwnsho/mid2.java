package collection.link;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> list = new MyLinkedListV3<>();

        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        String string = list.get(1);
        System.out.println("get(1) = " + string);
    }
}
