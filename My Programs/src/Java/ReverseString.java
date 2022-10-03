package Java;

public class ReverseString {
	public static void main(String[] args) {

		String a = "Automation";
		String rev = "";
		for(int j = a.length()-1; j>=0;j--)
			rev = rev + a.charAt(j);
		System.out.println(rev);
	}
}

//Program for reverse the string
