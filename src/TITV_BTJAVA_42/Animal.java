package TITV_BTJAVA_42;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("We are eatting");
    }
    public void makeSound(){
        System.out.println("________________");
    }
    public void sleep(){
        System.out.println("We are going to bed");
    }
}
