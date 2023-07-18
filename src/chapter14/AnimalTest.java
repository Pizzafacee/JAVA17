package chapter14;

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest();
        animalTest.adopt(new Cat("绿色", 4));
        animalTest.adopt(new Dog("蓝色",4));
    }

    public void adopt(Animal animal) {
        animal.eat();
        animal.jump();

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

        if (animal instanceof Dog) {
            Dog d = (Dog) animal;
            d.watchDoor();
        }
    }
}
