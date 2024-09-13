import java.util.Scanner;
public class AddIntegers {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr first number :- ");
		int a = sc.nextInt();
		System.out.print("Enetr second number :- ");
		int b = sc.nextInt();
		System.out.print("Sum = ");
		System.out.println(a+b);
		sc.close();
	}

}