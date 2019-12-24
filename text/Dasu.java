public class Dasu {
	public static void main(String[] args) {

		int a, b, c;

		a = 10;
		b = 20;
		c = a + b; //30

		if(a > 15) {
		// 10 > 15 (X)
			System.out.println(c + 10);
		}else if(b > 10 && b < 30) {
		// 20 > 10 and 20 < 30 (O)
			if(c < 30 || c > 40) System.out.println(c +20); // 30 < 30(X) or 30 > 40(X)
			else if(c < 30) System.out.println(a + b + c); // 30 < 30(X)
			else if( !(c < 30)) System.out.println(a + b - c); // c < 30이 아니다(O)
			else System.out.println(a + b + 100); // (X)
		}else {
		// (X)
			System.out.println(c + 15);
		}
	}
}