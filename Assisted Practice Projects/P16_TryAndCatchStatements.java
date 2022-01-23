package Assisted_Practice_Projects_S;

public class P16_TryAndCatchStatements {
	    public static void main(String args[]) 
	    {
	        int[] array = new int[2];
	        try 
	        {
	            array[5] = 2;
	        }
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("Array Index is out of bounds exception!"); 
	        }
	        finally 
	        {
	            System.out.println("The array is of size : " + array.length);
	        }
	    }
}
