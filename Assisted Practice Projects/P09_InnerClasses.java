package Assisted_Practice_Projects_S;

public class P09_InnerClasses {
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
		P09_InnerClasses  inner=new P09_InnerClasses ();  
		inner.display();  
	}
}