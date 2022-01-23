package Assisted_Practice_Projects_S;

public class P06_ConstructorsAnd_itsTypes {
		int id;
		String name;
		
		public P06_ConstructorsAnd_itsTypes(String name, int id) {
			super();
			System.out.println("Parameterized Constructor");
			this.id=id;
			this.name = name;
		}
		public P06_ConstructorsAnd_itsTypes() {
			super();
			System.out.println("Default Constructor");
		}
		
		public static void main(String[] args) {
			P06_ConstructorsAnd_itsTypes p=new P06_ConstructorsAnd_itsTypes();
			System.out.println(p.id+" "+p.name);
			P06_ConstructorsAnd_itsTypes p1=new P06_ConstructorsAnd_itsTypes("Aniket",10);
			System.out.println(p1.id+" "+p1.name);
		}
}
