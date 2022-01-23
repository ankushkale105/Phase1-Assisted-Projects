package Assisted_Practice_Projects_S;
public class P04_CallByValueMethod {
	
		int val=20;

		int operation(int val) {
			val =val*10/100;
			return(val);
		}

		public static void main(String args[]) {
			P04_CallByValueMethod d = new P04_CallByValueMethod();
			System.out.println("Before operation value of data is : "+d.val);
			d.operation(100);
			System.out.println("After operation value of data is : "+d.val);
			}
}