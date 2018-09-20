import java.util.Scanner;
public class TIRunner 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num = -1;
		int num2 = -1;
		System.out.print("Enter first number: ");
		num = input.nextInt();
		System.out.print("Enter second number: ");
		num2 = input.nextInt();
		TwoIntegers nums = new TwoIntegers(num, num2);
		String math = nums.arithmetic();
		int larger = nums.larger();
		boolean even = nums.isEven();
		System.out.println(math);
		System.out.println("The number " + larger + " is larger.");
		System.out.println("The sum of the two numbers is even: " + even);
		boolean multiple = nums.multiple();
		System.out.println("The first number is a multiple of the second: " + multiple);
		
		
		
	}
}
