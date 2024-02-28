import java.util.Scanner;

class ProductOfNumbers {
	public static void main(String[] values) {
		int product = 1, number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		limit = sc.nextInt();
		for(int i=1;i<=number;i++) {
			product *= i;
		}
		System.out.println("Product of first '"+number+"' numbers: " + product);
	}
}