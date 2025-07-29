package collection.link;



public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        System.out.println("==데이터 추가==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);
        System.out.println();

        System.out.println("==기능 사용==");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf('c') = " + list.indexOf("c"));
        System.out.println("list.set(2, 'z'), oldValue = " + list.set(2, "z"));

        System.out.println();
        System.out.println("==범위 초과==");
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);

        list.add("f");
        System.out.println(list);

        System.out.println();
        System.out.println("index에 value 추가");
        list.add("A", 0);
        System.out.println(list);
        list.add("B", 2);
        System.out.println(list);

        System.out.println("index의 value 삭제");
        list.remove(0);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }

}
