import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:-");
		int n = sc.nextInt();
		int temp = n;
		int r, sum = 0;

		while (n > 0) {
			r = n % 10;
			sum = sum + r * r * r * r;
			n = n / 10;

		}
		System.out.println("Armstring Number  is: - " + sum);

		if (temp == sum) {
			System.out.println("Armstrong Number!!!");
		} else {
			System.out.println("Not Armstrong NUmber!!!");
		}
	}
}
