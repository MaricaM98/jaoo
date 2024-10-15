package shape;

public class MainShape {
	public static void main(String[] args) {
		Triangle t1 = Triangle.newTriangle(18, 24);
		t1.calculateArea();
		System.out
				.println("Area calcolata con metodo abstract definito in abstract class Shape: " + t1.calculateArea());
		t1.area();
		Triangle t2 = Triangle.newTriangle(30, 50);
		if (t1.compareTo(t2) < 0) {
			System.out.println("Il triangolo t1 è più piccolo del triangolo t2");
		} else if (t1.compareTo(t2) == 0) {
			System.out.println("Il triangolo t1 è uguale al triangolo t2");
		} else {
			System.out.println("Il triangolo t1 è più grande del triangolo t2");
		}

		int a = 2;
		int b = 17;
		int c = 9;
		int sum = a + b + c;
		boolean isTeen = fixTeen(a) == 0 ||fixTeen(b) == 0 || fixTeen(c) == 0;
		if (isTeen) {
			sum = fixTeen(a) + fixTeen(b) + fixTeen(c);
			System.out.println(sum);
		}else {
			System.out.println(sum);
		}
		

	}

public static int fixTeen (int n) {
if((n>=13 && n<=19) && (n!=15 && n!=16)) {
	n = 0;
	return n;
}else {
	return n;
}
}
}
