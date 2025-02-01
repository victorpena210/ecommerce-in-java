package methods;

public class PassByValueDemo {
	
	public static void main(String[] args) {
		
	}
	
	private static void changeIntValue(int i) {
		i += 100;
	}
	
	private static int changeInt(int i) {
		i += 100;
		return i;
		
	}
	
	private static void changeArray(int[] array) {
		array[1] = 200;
	}
	
	

}
