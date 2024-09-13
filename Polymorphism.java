class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

class Dogs extends Animal {
    void sound() {
        System.out.println("Dogs barks");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myCat = new Cat();
        Animal myDog = new Dogs();

        myAnimal.sound();  // Animal makes a sound
        myCat.sound();     // Cat meows
        myDog.sound();     // Dog barks
    }
}
