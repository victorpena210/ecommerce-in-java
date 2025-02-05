package methods;

public class StringProcessor {
	
    public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
			"peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
			"james;Derek James;james@gmail.com" + System.lineSeparator() +
			"jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
			"gregory;Mike Gregory;gregory@yahoo.com";
    
	public static void main(String[] args) {
		System.out.println("===== Convert 1 demo =====");
		System.out.println(convert1(INPUT_DATA));		
		
		
		System.out.println("===== Convert 2 demo =====");
		System.out.println(convert2(INPUT_DATA));
		
	}
	
	public static String convert1(String input) {
		String result = "";
		String[] resultArray = input.split(System.lineSeparator());
		
		for(int i = 0; i < resultArray.length; i++) {
			String[] arraySeparated = resultArray[i].split(";");
			result += arraySeparated[0] + " ==> " + arraySeparated[2] + System.lineSeparator();
		}
		
		return result;

	}
	
	
	public static String convert2(String input) {
		String result = "";
		String [] array1 = input.split(System.lineSeparator());
		
		for(int i = 0; i < array1.length;i++) {
			String[] array2 = array1[i].split(";");
			result += array2[1] + "(email: " + array2[2] + ")" + System.lineSeparator();
		}
		return result;
		
	
	}

}
