package lcmAndGcd;

public class LcmAndGcd {

		public class LcmGcdUsingMethods {
			public static int lcm(int a, int b) {
				int max = (a > b) ? a : b;
				int lcm = max, k = 2;
				while (true) {
					if (lcm % a == 0 && lcm % b == 0) {
						break;
					}
					lcm = max * k++;
				}
				return lcm;
			}

			public static int lcm(int a, int b, int c) {
				int max = (a > b) ? (a > c ? a : c) : b;
				int lcm = max, k = 2;
				while (true) {
					if (lcm % a == 0 && lcm % b == 0 && lcm % c == 0) {
						break;
					}
					lcm = max * k++;
				}
				return lcm;
			}
			public static int gcd(int a, int b) {
				int min=(a<b)?a:b;
				int gcd=1;
				for(int i=min;i>=1;i--) {
					if(a%i==0&&b%i==0) {
						gcd=i;
						break;
					}
					
				}
				return gcd;
			}
			public static int gcd(int a, int b,int c) {
				int min=(a<b)?(a<c?a:c):b;
				int gcd=1;
				for(int i=min;i>=1;i--) {
					if(a%i==0&&b%i==0&&c%i==0) {
						gcd=i;
						break;
					}
					
				}
				return gcd;
			}
			public static void main(String[] args) {
				int lcm=lcm(12,8);
				int gcd=gcd(12,8);
				int lcm1=lcm(12,8,14);
				int gcd1=gcd(12,8,4);
				System.out.println(lcm);
				System.out.println(gcd);
				System.out.println(lcm1);
				System.out.println(gcd1);
			}

		}
	}


