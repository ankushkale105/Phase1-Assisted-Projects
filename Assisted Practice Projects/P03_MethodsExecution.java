package Assisted_Practice_Projects_S;

public class P03_MethodsExecution {

	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {

		P03_MethodsExecution b=new P03_MethodsExecution();
		int ans= b.multipynumbers(10,3);
		System.out.println("Multipilcation is : "+ans);
		}

}
	