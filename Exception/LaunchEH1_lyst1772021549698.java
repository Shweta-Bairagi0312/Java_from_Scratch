
public class LaunchEH1 {

	public static void main(String[] args)
	{
		//Compile time error
		// Runtime error
		// Exception
		System.out.println("Hello1");
		try 
		{
			Thread.sleep(5000);
			
		} 
		catch (InterruptedException e)
		{
			System.out.println("Somethig happened");
		}
		System.out.println("Hello2");
//		Telusko t=new Telusko();
//		t.courses();
	}
}
