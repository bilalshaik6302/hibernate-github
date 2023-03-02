package lcmAndGcd;

import java.util.Scanner;

public class SumOfLcmAndGcm {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size");
		int n = scanner.nextInt();
		int a[]= new int[n];
		for(int i = 0 ;i<n;i++) {
			a[i] =scanner.nextInt();
		}
		int lcm = lcm(a);
		int gcd = gcd(a);
		System.out.println(lcm);
		System.out.println(gcd);
		System.out.println(lcm + gcd);
		
	}
		public static int lcm(int []a){
		int max = 0;
//		int max = a[0];
		for(int i = 1;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		int lcm =max,k=2,flag=0;
		while(true) {
			for(int i = 0;i<a.length;i++) {
				if(lcm%a[i]==0) {
					flag = 1;
				}
				else {
					flag = 0;
					break;
				}
			}
			if(flag == 1) {
				return lcm;
			}
			else {
				lcm = max * k++;
			}
		}
	}
		
	public static int gcd (int [] a) {
		int min = a[0];
			for(int i = 0;i<a.length;i++) {
				if(a[i]<min) {
					min = a[i];
				}
			}
			int flag = 0;
			for(int i = 0 ;i>=1;i--) {
				for(int j = 0;j<a.length;j++) {
					if(a[j] %i ==0) {
						flag = 1;
					}
					else {
						flag = 0;
						break;
					}
				}
				if(flag == 1) {
					return i;
				}
			}
			return 1;
	}
}
//coding sites for practice
//codingbat
//hackerRank
//HackerEarth
//Leetcode


