package generic.test.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 100);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.setAnimal(dog);

        Cat returnCat = hospital.printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);
    }
}
