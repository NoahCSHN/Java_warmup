
public class FloatCal {
	public static void main(String[] args) {
        double a = 1.0;
        double b = 3.0;
        double c = -4.0;
        double r0 = 0, r1 = 0;
        r0 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        r1 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println(r0);
        System.out.println(r1);
	}
}
