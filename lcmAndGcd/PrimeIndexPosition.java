package lcmAndGcd;

import java.util.Scanner;

public class PrimeIndexPosition {
		public static long rev(long num) {
			long rev = 0;
			while (num != 0) {
				long r = num % 10;
				rev = rev * 10 + r;
				num /= 10;
			}
			return rev;
		}
	
		public static long primePosition(long num) {
			num = rev(num);
			System.out.println(num);
			long p = 0, res = 0;
			while (num != 0) {
				p++;
				if (prime(p)) {
					long r = num % 10;
					res = res * 10 + r;
				}
				num /= 10;
			}
			return res;
		}
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number");
			long num = scan.nextLong();
			long res = primePosition(num);
			System.out.println(res);
		}
	
		public static boolean prime(long n) {
			int count = 0;
			
			for (int i = 1; i <= n; i++) {
				
				if (n % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				return true;
			} else {
				return false;
			}
	
		}
}