import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		i=sc.nextInt();
		
		for(j=0;j<=5;j++)

		{
			System.out.println(i+"*"+j+"="+(i*j));
		}
	}
}



