package Java;

public class Armstrongno {
	public static void main(String[] args) {
		int numberToCheck = 153;
		int temp = numberToCheck;
		int reminder = 0;
		int result = 0;
		
		while(temp !=0) {
			reminder = temp%10;
			 result = result + (reminder*reminder*reminder);
			 temp = temp/10;
		}
		if(result==numberToCheck)
			System.out.println(numberToCheck + " = is Armstrong Number");
		else
			System.out.println(numberToCheck + " = is NOT an Armstrong Number");
		}
}

// Java Program to check armstrong no.