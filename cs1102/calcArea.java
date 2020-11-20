
public class calcArea {

	static double calcAreaCircle(double radius) {
		//double A = Math.PI * radius * radius;
		double A = Math.PI * Math.pow(radius, 2);
		return A;
	}
	
	public static void main(String[] args) {
		double area = calcAreaCircle(5.0);

		System.out.println(area);
	}
}
