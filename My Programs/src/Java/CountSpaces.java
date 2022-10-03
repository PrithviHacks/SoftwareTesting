package Java;

public class CountSpaces {
public static void main(String[] args) {
		
		String str = "shiv ram shyam vada burger juice pizza";
		int x =0;
		for(int i = 0; i<str.length();i++) {
			char str1 = str.charAt(i);
			if(str1==' ') {
				x++;
			}
		}
		System.out.println(x);
			
	}
}

//Java program to count number of spaces 
