package generic.test.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 100);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("멍멍이2", 150);
        Dog biggerDog = AnimalMethod.bigger(dog, targetDog);
        System.out.println("biggerDog = " + biggerDog);
    }
}
