

public class Pr8_StringsAndConversions {

	public static void main(String[] args) {
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder ");
		System.out.println(" ");
		// conversion from String object to StringBuffer 
        StringBuffer sbr = new StringBuffer(" HELLO WORLD "); 
        sbr.reverse(); 
        System.out.println("String to String Buffer");
        System.out.println(sbr); 
          
        // conversion from String object to StringBuilder 
        StringBuilder sbl = new StringBuilder("BLUE WHALE "); 
        sbl.append("Aquatic life"); 
        System.out.println("String to String Builder");
        System.out.println(sbl);              		
	}
}
