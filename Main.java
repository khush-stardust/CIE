package CIE;
class Animal{
    void eat(){
        System.out.println("Eating");
    }

    void sleep(){
        System.out.println("Sleeping");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Eating");
    }
}

public class Main{
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.sleep();
        myDog.bark();
    }
}