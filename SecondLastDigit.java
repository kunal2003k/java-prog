import java.util.Scanner;

class SecondLastDigit {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int number = s.nextInt();
		int second_last = (number/10) % 10;
		System.out.println("Last digit of the number is: " + second_last);
	}
}