import java.util.Scanner;
public class Conditional {
       public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter age of Aman :- ");
        int ageOfAman = sc.nextInt();
        System.out.print("Enter age of Abhi :- ");
        int ageOfAbhi = sc.nextInt();
        if(ageOfAman > ageOfAbhi)  {
                System.out.println("Abhi is younger!");
        }
        else {
                System.out.println("Aman is Younger!");
        }
        System.out.print("Enter the value of \"a\" : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of \"b\" : ");
        int b = sc.nextInt();
        System.out.print("Enter the value of \"c\" : ");
        int c = sc.nextInt();
        if(a>b) {
                if(a>c) {
                        System.out.println("\"a\" is the largest.");
                }
                else{
                        System.out.println("\"c\" is the largest.");
                }
        }
        else{
                System.out.println("\"b\" is the largest.");
        }
        
        String CustomerStatus = sc.next();

        switch (CustomerStatus) {
                case "Regular_Customer":
                System.out.println("Thank you for your purches! Take a 10% discount for your order as a gratitude for staying with us");
                        
                        break;
        
                default:
                        break;
        }

        sc.close();

} 
}



