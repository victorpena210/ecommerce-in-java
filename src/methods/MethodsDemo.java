package methods;

public class MethodsDemo {
	
	public static void main(String[] args) {
		
		int sum = sum(1,3);
		printToConsole(sum);
		double sum2 = sum(2.1,2.3);
		printToConsole(sum2);
		
	}
	
	private static int sum(int x, int y) {
		return x + y;
	}
	
	private static double sum(double d, double e) {
		return d + e;
	}
	
	private static void printToConsole(String text) {
		System.out.println(text);
	}
	
	private static void printToConsole(int i) {
		System.out.println(i);
	}
	
	private static void printToConsole(double d) {
		System.out.println(d);
	}

}
