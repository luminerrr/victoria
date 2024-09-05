public class Dog extends Animal {
    void bark() {
        System.out.println("the dog barks");
    }

    @Override
    void makeSound() {
        System.out.println("Woof woof");
    }

    @Override
    void sound() {
        System.out.println("Woof woof sound");
    }
}
