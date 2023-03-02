package lcmAndGcd;

import java.util.Scanner;

public class GcdOfnNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size");
		int n = scanner.nextInt();
		int[ ] a =new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter a Number");
			a[i]=scanner.nextInt();
		}
		int min=min(a);
		System.out.println("least"+min);
		int res = gcd(a,min);
		System.out.println(res);
	}
	private static int gcd (int[ ]a,int min) {
		int gcd = min;
		for(int i = min ;i>=1;i++) {
			int count = 0;
			for(int j = 0;j<a.length;j++) {
				if(a[j]%i==0) {
					count++;
				}
			}
			if(count ==a.length) {
				gcd=i;
				break;
			}
		}
		return gcd;
	}

	private static int min(int[]a) {
		int min =a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				int temp = min;
				min = a[i];
				a[i] = temp;
			}
		}
		return min;
	}
}
