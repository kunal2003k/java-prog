import java.util.Scanner;

class LastDigit {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int number = s.nextInt();
		int last = number%10;
		System.out.println("Last digit of the number is: " + last);
	}
}