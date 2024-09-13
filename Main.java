class Car       {
        String color;
        String model;
        void display() {
                System.out.println("Color : " + color + " , Model : " + model);
        }
}
public class Main {
        public static void main(String[] args)  {
        Car car1 = new Car();
        car1.color = "Red";
        car1.model = "Toyota";
        car1.display();

   }     
        
}
