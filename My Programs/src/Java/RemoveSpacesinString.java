package Java;

public class RemoveSpacesinString {
public static void main(String[] args) {
		
		String s = "i am a manual tester";
		s = s.replace(" ", "");
		String rev = "";
		for(int i = s.length()-1;i>=0;i--)
			rev = rev + s.charAt(i);
		System.out.println(rev);
}
}

//Write program to reverse the string by removing the spaces 