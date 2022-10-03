package Java;

public class StringinArray {

		public static void main(String[] args) {

			String[] a = { "avdhut", "automation", "selenium", "avdhut", "testng", "software", "software", "selenium",
					"Engineer" };
			
			for(int i = 0; i<a.length; i++) {
				for(int j = i+1; j<a.length; j++ ) {
					if(a[i]==a[j]) {
						System.out.println(a[j]);
						break;
					}
				}
			}

		}
	}

//Program to find duplicate string in array 
