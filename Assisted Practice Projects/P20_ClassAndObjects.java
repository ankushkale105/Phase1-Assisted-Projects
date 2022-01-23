package Assisted_Practice_Projects_S;

public class P20_ClassAndObjects { 
	    String name;  
	    int age; 
	    String color; 
	    public P20_ClassAndObjects(String name, int age, String color) 
	    { 
	        this.name = name;  
	        this.age = age; 
	        this.color = color; 
	    } 
	    public String getName() 
	    { 
	        return name; 
	    }  
	    public int getAge() 
	    { 
	        return age; 
	    } 
	    public String getColor() 
	    { 
	        return color; 
	    } 
	    @Override
	    public String toString() 
	    { 
	        return("Hi my name is "+ this.getName()+ ".\n\nMy age and color are " + this.getAge()+ " and"+ this.getColor() + "."); 
	    } 
	    public static void main(String[] args) 
	    { 
	        P20_ClassAndObjects scott = new P20_ClassAndObjects("Ajinkya", 23, " fair"); 
	        System.out.println(scott.toString()); 
	    } 
	}
