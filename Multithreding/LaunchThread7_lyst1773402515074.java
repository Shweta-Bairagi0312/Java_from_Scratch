class Library implements Runnable
{
	String java=new String("JAVA");
	String devOps=new String("DEVOPS");
	String aws=new String("AWS");
	
	@Override
	public void run() 
	{
		String name=Thread.currentThread().getName();
		if(name.equals("KAPIL"))
		{
			try
			{
				System.out.println("KAPIL got into library");
				Thread.sleep(5000);
				synchronized(java)
				{
					System.out.println("Kapil has acquired Java book");
					Thread.sleep(5000);
					synchronized(devOps)
					{
						System.out.println("Kapil has acquired DevOps book");
						Thread.sleep(5000);
						synchronized(aws)
						{
							System.out.println("Kapil has acquired AWS book");
							Thread.sleep(5000);
						}
						
					}
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			try
			{
				System.out.println("DINESH got into library");
				Thread.sleep(5000);
				synchronized(aws)
				{
					System.out.println("dinesh has acquired AWS BOOK");
					Thread.sleep(5000);
					synchronized(devOps)
					{
						System.out.println("dinesh has acquired DevOps book");
						Thread.sleep(5000);
						synchronized(java)
						{
							System.out.println("dinesh has acquired Java book");
							Thread.sleep(5000);
						}
						
					}
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		
	}
	
}
public class LaunchThread7 
{
	public static void main(String[] args)
	{
		Library lib=new Library();
		
		Thread t1=new Thread(lib);
		Thread t2=new Thread(lib);
		
		t1.setName("KAPIL");
		t2.setName("DINESH");//new
		
		t1.start();
		t2.start();//runnable
		
		
	}

}
