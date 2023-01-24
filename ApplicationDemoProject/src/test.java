import java.util.Scanner;

public class test {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:- ");
		int n = sc.nextInt();
		
		int rev = 0,r;
		int temp = n;
		while(n>0)
		{
		r = n%10;
		rev = rev*10+r;
		n  = n/10;
		
		}
		
		System.out.println("Reverse Number is : - " + rev);
		if(temp == rev)
		{
			System.out.println("Plaindrome Number!!!");
		}else
		{
			System.out.println("Not Plaindrome!!");
		}

	}

}
