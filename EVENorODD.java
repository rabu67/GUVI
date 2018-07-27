import java.util.Scanner;
public class EVENorODD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int x;
		x=sc.nextInt();
		if(x<0)
		{
			System.out.println("invalid");
		}
		else if(x%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}

}
