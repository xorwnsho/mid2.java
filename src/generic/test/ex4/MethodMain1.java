package generic.test.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 1;
        Object obj = GenericMethod.objMethod(i);

        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(1);

        Integer result2 = GenericMethod.<Integer>numberMethod(1);
        Double result3 = GenericMethod.<Double>numberMethod(1.0);
    }
}
