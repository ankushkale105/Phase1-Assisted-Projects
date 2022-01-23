package Assisted_Practice_Projects_S;

public class P29_Stack {
	    	static final int MAX = 1000; 
	    	int top; 
	    	int a[] = new int[MAX];  
	    	
	    	boolean isEmpty() 
	    	{ 
	        		return (top < 0); 
	    	} 
	    	
	    	P29_Stack() 
	    	{ 
	        		top = -1; 
	    	} 
	  	
	    	boolean push(int x) 
	    	{ 
	        		if (top >= (MAX-1)) 
	        		{ 
	            			System.out.println("Stack Overflow"); 
	            			return false; 
	        		} 
	        		else
	        		{ 
	            			a[++top] = x; 
	            			System.out.println(x + " is PUSHED into stack"); 
	            			return true; 
	        		} 
	    	}
	    	
	    	int pop() 
	    	{ 
	        		if (top < 0) 
	        		{ 
	            			System.out.println("Stack Underflow"); 
	            			return 0; 
	        		} 
	        		else
	        		{ 
	            			int x = a[top--]; 
	            			return x; 
	        		} 
	    	} 
	    
	    	
	    	public static void main(String args[])
	    	{
	        		P29_Stack s = new P29_Stack(); 
	        		s.push(111); 
	        		s.push(222); 
	        		s.push(333); 
	        		System.out.println("\n" + s.pop() +" is POPPED from stack"); 
	    	}
	} 	
