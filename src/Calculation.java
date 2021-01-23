import java.util.Scanner;

public class Calculation {
	
	public static void main(String[] args) {
		
		int num1, num2, sum, diff, prod;
		double quot;
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("enter two integers: ");
		num1 = myObj.nextInt();
		num2 = myObj.nextInt();
		
		myObj.close();
		
		sum = addition(num1, num2);
		System.out.println("sum of integers is: " + sum);
		diff = subtraction(num1, num2);
		System.out.println("difference of integers is: " + diff);
		prod = multiplication(num1, num2);
		System.out.println("product of integers is: " + prod);
		quot = division(num1, num2);
		System.out.println("quotient of integers is: " + quot);
		
		
		
	}
	public static int addition(int num1, int num2)
	{
		int n1 = num1, n2 = num2;
		return (n1 + n2);
	}
	
	public static int subtraction(int num1, int num2)
	{
		int n1 = num1, n2 = num2;
		return (n1 - n2);
	}
	
	public static int multiplication(int num1, int num2)
	{
		int n1 = num1, n2 = num2;
		return (n1 * n2);
	}
	
	public static double division(int num1, int num2)
	{
		int n1 = num1, n2 = num2;
		return ((double) n1 / n2);
	}
}
