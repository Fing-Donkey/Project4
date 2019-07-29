public class Rational extends Number implements Comparable<Rational> {
	private double numerator;
	private double denominator;
	public int compareTo(Rational o) {
		if(Rational < o.Rational) {
			return -1;
		}
		else if(Rational > o.Rational){
			return +1;
		}
		return 0;
	}
	int Rational;
	public Rational(double num, double deno) {
		numerator = num;
		denominator = deno;
	}
	public Rational add(Rational o) {
		double numerator1 = numerator * o.denominator;
		double numerator2 = o.numerator * denominator;
		double denominator1 = denominator *o.denominator;
		return new Rational(numerator1 + numerator2, denominator1);
	}
	public Rational div(Rational o) {
		 double numerator1 = numerator * o.denominator;
		 double denominator1 = denominator * o.numerator;
		 return new Rational(numerator1, denominator1);
	}
	public Rational mul(Rational o) {
		return new Rational(numerator * o.numerator, denominator * o.denominator);
	}
	public Rational sub(Rational o) {
		double numerator1 = numerator * o.denominator;
		double numerator2 = o.numerator * denominator;
		double denominator1 = denominator * o.denominator;
		return new Rational(numerator1 - numerator2, denominator1);
	}
	private Rational gcd(Rational o) {
		int x =1;
		int k =1;
		while(k <= denominator && k <= o.denominator) {
			if(numerator % k == 0 && o.numerator % k == 0) {
				x = k;
				k++;
			}
		}
		return new Rational(numerator, x);
	}
	public String toString() {
		return "(" + numerator + "/" + denominator + ")";
	}
	public double doubleValue() {
		return numerator * 1.0/denominator;
	}
	public float floatValue() {
		return (float)doubleValue();
	}
	public int intValue() {
		return (int)doubleValue();
	}
	public long longValue() {
		return(long)doubleValue();
	}
}
