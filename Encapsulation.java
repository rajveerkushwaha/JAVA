class Person {
        private String name;
        private int age;
        public String getname() {
                return name;
        }
        public void setname(String name) {
                this.name = name;
        }
        public int getage()     {
                return age;
        }
        public void setage(int age)     {
                this.age = age;
        }
}
public class Encapsulation {
        public static void main(String[] args)  {
                Person person = new Person();
                person.setname("Abhi");
                person.setage(20);
                System.out.println("Name : "+ person.getname() + " , Age : "+ person.getage());
        }
        
}
