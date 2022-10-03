package Java;

public class RemoveSpecialCharacter {
public static void main(String[] args) {
		
		String s = "agag%%$6uss82803030@&$hd*&33fjdd125785#@#%%^!GW!#%^#^$^jfgfeefe2f555rf2rffef2ef5f2ff5wdwgwgyyhcnefhef";
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		
	}
}

/// Write program to remove special character from given string 
