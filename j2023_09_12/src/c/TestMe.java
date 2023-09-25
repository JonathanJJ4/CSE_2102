package c;

public class TestMe {
	private double value = Double.NaN;

	public static void main(String[] args) {
		System.out.println("Hello world!");
	}

	public TestMe() {}

	public double square() { return value*value; }
	public double cube() { return value*value*value; }
	public double times_two() { return value*2; }
	public double times_ten() { return value*10; }
	public void setValue(double v) {
		value = v;
	}

}
