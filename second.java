import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a Java program to print the area and perimeter of a circle.

		double r;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius of the Circle");
		r=sc.nextDouble();
		
		System.out.println("Area of the circle is " + Math.PI*Math.pow(r,2));
		System.out.println("Perimeter of the circle is " + (2*Math.PI*r));
		
		

	}

}
