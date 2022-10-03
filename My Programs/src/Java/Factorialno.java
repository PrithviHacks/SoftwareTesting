package Java;

public class Factorialno {
	public static void main(String[] args) {
		int a = 5;
		int res = 1;
		
		for(int  i = a; i>0 ; i--)
		{
			res = res * i;   // 5*1 = 5res *4 = 20res * 3
		}	
		System.out.println(res);
	}
}

//Java program to calculate Factorial of a number 