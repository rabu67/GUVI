import java.util.Scanner;
public class chknumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x;
		System.out.println("enter a number");
		x=s.nextInt();
		if(x==0)
		{
			System.out.println("zero");
		}
		else if(x>0)
		{
			System.out.println("positive");
		}
		else
		{
			System.out.println("negative");
		}

	}

}
