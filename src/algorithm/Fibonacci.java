package algorithm;

public class Fibonacci {
	
	// Tom so fibonacci thu n
	public static int Fibo(int n) {
		// Bai toan co so
		if (n <= 2 ) {
			return 1;
		}
		// Cong thuc quy nap
		int Fn = Fibo(n-1) + Fibo(n-2);
		return Fn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fibo(8));
	}

}
