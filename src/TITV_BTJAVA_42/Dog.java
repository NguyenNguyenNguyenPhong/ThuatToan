package TITV_BTJAVA_42;

public class Dog extends Animal{

    public Dog() {
        super("Dog");
    }

    @Override
    public void eat() {
        System.out.println("An xuong");
    }

    @Override
    public void makeSound() {
        System.out.println("Gau Gau");
    }
}
