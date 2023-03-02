package lcmAndGcd;

import java.util.Scanner;

public class GcdOfnNumberss {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size");
		int n = scanner.nextInt();
		int a[ ]= new int[n];
		for(int i = 0 ;i<n;i++) {
			a[i] =scanner.nextInt();
		}
		int min =a[0];
		for(int i = 0;i<n;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		int gcd =a[0];
		for(int i = 1;i<n;i++) {
			gcd=gcd(gcd,a[i]);
		}
		System.out.println("the gcd of the given numbers is"+gcd);
	}
	public static int gcd(int a,int b) {
		int min = (a>b)?b:a;
		for(int i=min;i>=1;i--) {
			if(a%i==0 && b%i==0) {
				return i;
			}
		}
		return 1;
	}
}
