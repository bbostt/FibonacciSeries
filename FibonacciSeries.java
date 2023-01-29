import java.util.Scanner;

public class FibonacciSeries {
	
	// Fibonacci serisinin eleman sayýsýný kullanýcýdan alýn.
	// 9 Elemanlý Fibonacci Serisi : 1 1 2 3 5 8 13 21 34
	
	// fib(n) = fib(n-1) + fib(n-2)
	
	static int fib(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		
		return fib(n-1) + fib(n-2);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of  elements : ");
		int n = input.nextInt();
		
		System.out.println(fib(n));
		
	}

}