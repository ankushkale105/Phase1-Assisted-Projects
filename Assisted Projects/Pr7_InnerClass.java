

public class Pr7_InnerClass {
	
	private String msg="Working of Inner Classes";
		void display(){  
			 class Inner{  
				 void msg(){
					 System.out.println(msg);
				 }  
		  }  
		  
		  Inner inner=new Inner();  
		  inner.msg();  
		 }  

		 
		public static void main(String[] args) {
			Pr7_InnerClass  inner=new Pr7_InnerClass ();  
			inner.display();  
		}
}
