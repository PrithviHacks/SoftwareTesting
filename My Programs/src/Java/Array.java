package Java;

import java.util.Arrays;

public class Array {
public static void main(String[] args) {
		
		int ar1[] = {10,20,50,44};
		int ar2[] = {11,21,52,41};
		int ar3[] = {10,20,50,44};
		
		System.out.println(Arrays.equals(ar1,ar2));
		System.out.println(Arrays.equals(ar1,ar3));
		System.out.println(Arrays.equals(ar2,ar3));
}
}

