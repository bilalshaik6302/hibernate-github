package lcmAndGcd;

public class GcdOfThreeNumbers {

	public static void main(String[] args) {
		int a=12,b=8,c=6;
		int min1=(a>b)?b:a;
		int min =(min1>c)?c:min1;
		int gcd=1;
		for(int i=min;i>1;i--) {
			if(a%i==0&&b%i==0&&c%i==0) {
				gcd=i;
				break;
			}
		}
		System.out.println(gcd);

	}

}
