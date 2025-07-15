package generic.test.ex4;

public class GenericMethod {
    public static Object objMethod(Object obj) {
        System.out.println("object print: " + obj);
        return obj;
    }

    public static <T> T genericMethod(T t){
        System.out.println("generic Method: " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t){
        System.out.println("number Method: " + t);
        return t;
    }
}
