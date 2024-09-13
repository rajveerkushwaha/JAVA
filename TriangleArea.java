import java.util.Scanner;

public class TriangleArea {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter A side of a triangle: ");
		int A = sc.nextInt();
		
		System.out.print("Please, enter B side of a triangle: ");
		int B = sc.nextInt();
		
		System.out.print("Please, enter C side of a triangle: ");
		int C = sc.nextInt();
		int s = (A+B+C)/2;
		int SqurAr = s*(s-A)*(s-B)*(s-C);
		int triangleArea = (int)Math.sqrt(SqurAr);
		System.out.println("Triangle area is: " + triangleArea);
                sc.close();
		
	}

}
