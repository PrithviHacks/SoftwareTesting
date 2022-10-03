package Java;

public class StringisPalindrome {
	public static void main(String[] args) {

		String a = "prithvi";
		String rev = "";
		for(int i = a.length()-1; i>=0; i--) {
			rev = rev + a.charAt(i);
		}
		if(rev.equals(a))
			System.out.println(a + " is palingdrome");
		else
			System.out.println(a + " is NOT palingdrome");
	}
}

