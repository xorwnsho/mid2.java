package generic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10);
        Integer integer = integerBox.getValue();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("Hello");
        String string = stringBox.get();
        System.out.println("string = " + string);
    }
}
