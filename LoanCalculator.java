package Assignment1;
import java.util.Scanner;
import java.lang.Math;

public class LoanCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double loan = 0, intRate = 0, payment = 0;
		int numOfPayments = 0;
		System.out.println("Loan Calculator");
		System.out.println("----------------");
		System.out.print("enter a loan amount: ");
		loan = input.nextDouble();
		while(loan <= 0) {
			System.out.println("amount must be greater than zero");
			System.out.print("enter a loan amount: ");
			loan = input.nextDouble();
		}
		System.out.print("enter the interest rate: ");
		intRate = input.nextDouble();
		intRate /= 100;
		while(intRate <= 0) {
			System.out.println("rate must be greater than zero");
			System.out.print("enter a the interest rate: ");
			intRate = input.nextDouble();
			intRate /= 100;
		}
		System.out.print("enter the number of payments: ");
		numOfPayments = input.nextInt();
		while(numOfPayments <= 0) {
			System.out.println("number of payments must be greater than zero");
			System.out.print("enter the number of payments: ");
			numOfPayments = input.nextInt();
		}
		payment = loan * ((intRate/12.0)/(1 - Math.pow((1 + (intRate/12.0)),-numOfPayments)));
		System.out.print("The monthly payments for a loan amount of "+ loan + " is $");
		System.out.printf("%.2f", payment);
	}

}
