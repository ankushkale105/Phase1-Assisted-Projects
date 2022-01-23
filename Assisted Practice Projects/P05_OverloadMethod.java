package Assisted_Practice_Projects_S;

public class P05_OverloadMethod {
		public void area(int b,int h)
		    {
		         System.out.println("Area of the Triangle is : "+(0.5*b*h));
		    }
		    public void area(int r) 
		    {
		         System.out.println("Area of the Circle is : "+(3.14*r*r));
		    }

		    public static void main(String args[])
		   {
		       P05_OverloadMethod ob=new P05_OverloadMethod();
		       ob.area(20,25);
		       ob.area(10);  
		   }
		}