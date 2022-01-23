
import java.util.regex.*;

public class Pr10_RegularExpression {
	public static void main(String[] args) {
			String pattern = "[4-9]+";
			String check = "0123456789";
			Pattern p = Pattern.compile(pattern);
			Matcher c = p.matcher(check);
			
			while (c.find())
		      	System.out.println( check.substring( c.start(), c.end() ) );
			}
		

	}


