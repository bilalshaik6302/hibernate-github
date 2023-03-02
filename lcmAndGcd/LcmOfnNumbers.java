package lcmAndGcd;

import java.util.Scanner;

public class LcmOfnNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int a[] = {8,12,24,32,16};
//		output =96
		System.out.println("enter the size");
		int n = scanner.nextInt();
		int a[ ]= new int[n];
		for(int i = 0 ;i<n;i++) {
			a[i] =scanner.nextInt();
		}
		int max = 0;
//		int max = a[0];
		for(int i = 1;i<n;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		int lcm =max,k=2,flag=0;
		while(true) {
//			for(int i = 0;i<a.length;i++) {
			for(int i = 0;i<n;i++) {
				if(lcm%a[i]==0) {
					flag = 1;
				}
				else {
					flag = 0;
					break;
				}
			}
			if(flag == 1) {
				System.out.println(lcm);
				break;
			}
			else {
				lcm = max * k++;
			}
		}
	}

}
