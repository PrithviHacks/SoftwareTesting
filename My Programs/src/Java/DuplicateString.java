package Java;

public class DuplicateString {
public static void main(String[] args) {
		
		String a = "hajaajp";
		
		char[]ar = a.toCharArray();
		
		for(int i =0; i<ar.length;i++) {
			for(int j = i+1; j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					System.out.println(ar[j]);
					break;
				}
			}
		}
	}
}

//Find duplicate char in string