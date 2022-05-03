import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
		

		int i;
		System.out.println("The numbers divisible by 3 are");
		for (i=1;i<=100;i++){
			if (i%3==0)
		
		
		System.out.println( i );
		}
		
		System.out.println("The numbers divisible by 5 are");
		for (i=1;i<=100;i++){
			if (i%5==0)
		
		
		System.out.println( i );
		}
		
		System.out.println("The numbers divisible by 3&5 are");
		for (i=1;i<=100;i++){
			if (i%3==0 & i%5==0)
		
		
		System.out.println( i );
		}
		

	}

}
