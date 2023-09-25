
public class Implisit {

	public static void main(String args[]) {

		int a;

		byte b = 10;

		a = b; // 4 = 1 , widening , Implicit TC

		System.out.println("a = " + a);

		System.out.println("b = " + b);

	}

}

class Cast1 {

	public static void main(String args[]) {

		int a = 100;

		byte b = 10;

		b = (byte) a; // Narrowing , Explicit

		System.out.println("a = " + a);

		System.out.println("b = " + b);

	}

}

class Cast2 {

	public static void main(String args[]) {

		int a = 100;

		long b = 10;

		a = (int) b;

		System.out.println("a = " + a);

		System.out.println("b = " + b);

	}

}
