
public class LaunchPattern1 
{
	public static void main(String[] args)
	{
		int i, j;
		int n=8;
		
		for(i=0; i<=n ; i++)
		{
			for(j=0;j<=n ; j++)
			{
//				if(i==0 || j==0 || i==n || j==n)
//				if(i==0 || j==0 || i==n )
//				if(i==0 || j==n/2 )
//				if(i==0 || j==0 || i==n/2 || i==n )
				
//				if((i==0 && j>0 && j<n)  ||  (j==0 && i>0) 
//						|| (j==n && i>0) || i==n/2)
//				if((i==0 && j> 0) || (i==n && j>0) || (j==0 && i>0 && i<n))
				if((i==0 && j<n) || (i==n && j<n) || j==0 || (j==n && i>0 && i<n))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			
			}
			System.out.println();

		}
		
	}

}
