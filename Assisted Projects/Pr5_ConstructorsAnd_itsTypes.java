
import java.util.*;

public class Pr5_ConstructorsAnd_itsTypes {
		int id;
		String name;
		
		public Pr5_ConstructorsAnd_itsTypes(String name, int id) {
			super();
			System.out.println("Parameterized Constructor");
			this.id=id;
			this.name = name;
		}
		public Pr5_ConstructorsAnd_itsTypes() {
			super();
			System.out.println("Default Constructor");
		}
		
		public static void main(String[] args) {
			Pr5_ConstructorsAnd_itsTypes p=new Pr5_ConstructorsAnd_itsTypes();
			System.out.println(p.id+" "+p.name);
			Pr5_ConstructorsAnd_itsTypes p1=new Pr5_ConstructorsAnd_itsTypes("Aniket",10);
			System.out.println(p1.id+" "+p1.name);
			
			

		}
}
		
