package Java;

public class Arrays {
	public static void main(String[] args) {

		int [] a = {12,55,88,66,88,8,8,8,54,55555,888};
		int temp = 0;
		
		for(int i =0; i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]<a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("second largest number: " + a[1]);
 	}
}

// Java program to find second largest element in Array 