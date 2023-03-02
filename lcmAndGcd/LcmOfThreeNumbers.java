package lcmAndGcd;

public class LcmOfThreeNumbers {
	public static void main(String[] args) {
		int a=12,b=8,c=18;
		int max,max1;
		max=(a>b)?a:b;
		max1=(max>c)?max:c;
		int lcm=max,k=2;
		while (true) {
			if(lcm%a==0&&lcm%b==0&&lcm%c==0) {
				break;
			}
			lcm=max*k++;
		}
		System.out.println(lcm);
//		output = 72
	}
}
