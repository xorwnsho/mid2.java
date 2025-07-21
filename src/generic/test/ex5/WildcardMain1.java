package generic.test.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class    WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> box = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));

        writeBox(box);
        writeBox(animalBox);

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcardV2(dogBox);

        WildcardEx.printGenericV1(catBox);
        WildcardEx.printGenericV2(dogBox);

        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
        Animal animal = WildcardEx.printAndReturnGeneric(dogBox);
    }

    static void writeBox(Box<? super Animal> box){
        box.set(new Dog("멍멍이", 100));
    }
}
