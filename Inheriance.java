class animal {
        void eat()      {
                System.out.println("This animal eats food");
        }
}

class Dog extends animal {
        void bark()     {
                System.out.println("This dog  barks");
        }
}
public class Inheriance {
        public static void main(String[] args) {
                Dog dog = new Dog();
                dog.eat();
                dog.bark();
        }
}
