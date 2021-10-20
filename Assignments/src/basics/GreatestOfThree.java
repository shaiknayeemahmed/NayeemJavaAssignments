package basics;

public class GreatestOfThree {

	public static void main(String[] args) {
		 int number1 = 10;
	        int number2 = 20;
	        int number3 = 30;

	        String result = (number1>number2) && (number1>number3)?"number1 is Greater":(number2>number3)?"number2 is Greater":"number3 is Greater";

	        System.out.println(result);
	}

}
