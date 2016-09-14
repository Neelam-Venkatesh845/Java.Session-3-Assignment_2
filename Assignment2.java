import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = sc.nextInt();
		boolean isPrime = true;
		int temp;
		for (int i = 2; i <= num / 2; i++) {
			temp = num % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime)
			System.out.println(num + " is Prime Number");
		else
			System.out.println(num + " is not Prime Number");

	}

}
