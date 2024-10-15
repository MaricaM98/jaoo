package shape;

public class Triangle extends Shape implements Comparable <Triangle>, InterfaceArea {
private double base;
private double height;

public Triangle(double base, double height) {
	this.base = base;
	this.height= height;	
}

public static Triangle newTriangle (double base, double height) {
	return new Triangle(base, height);
}

@Override
public double calculateArea() {
	double areaT = (base*height)/2;
	return areaT;
}

@Override
public void area() {
	double areaT1 = (base * height)/2;
	System.out.println("Area calcolata con metodo abstract definito in InterfaceArea: " + areaT1);
}



@Override
public int compareTo(Triangle o) {
	int cmp = Double.compare(height, o.height);
	if (cmp == 0) {
		return Double.compare(base, o.base);
	}
	return cmp;
}

@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}








}
