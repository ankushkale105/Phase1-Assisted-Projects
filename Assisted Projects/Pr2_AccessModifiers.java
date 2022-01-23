

public class Pr2_AccessModifiers {
	public int flag;
	public static void main(String[]args) {}
		protected void func() {
		System.out.println("Protected Accsess Specifier");
	}
	
	void met() {
		System.out.println("Package Access Specifier");
	}
	private void show() {
		System.out.println("Private Access Specifier");
	}
	class Other{
		void func() {
			Pr2_AccessModifiers n=new Pr2_AccessModifiers();
			n.flag = 15;
			System.out.println(n.flag);
			n.met();
			n.func();
		
		}
	}
}
