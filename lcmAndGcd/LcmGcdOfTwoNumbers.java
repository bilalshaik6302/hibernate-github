package lcmAndGcd;

public class LcmGcdOfTwoNumbers {
	public static void main(String[] args) {
		int a=12,b=8;
		int max;
		max=(a>b)?a:b;
		int lcm=max,k=2;
		while (true) {
			if(lcm%a==0&&lcm%b==0) {
				break;
			}
			lcm=max*k++;
		}
		System.out.println(lcm);
//		output = 24
	}
}
