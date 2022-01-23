package Assisted_Practice_Projects_S;

public class P13_ProgrammingThreadsCreation extends Thread {

	 	public void run()
	 	{
	  		System.out.println("Thread Started Running...");
	}
	 	public static void main( String args[] )
	 	{
	 		P13_ProgrammingThreadsCreation thread = new  P13_ProgrammingThreadsCreation();
	  		thread.start();
	 	}
}
