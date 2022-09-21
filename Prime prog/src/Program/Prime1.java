package Program;

public class Prime1
{

	public static void main(String[] args) 
	{
	   int no=100;
	   int count=0;
	   for(int i=1;i<=no;i++)
	   {
		   if(no%i==0)
		   {
			 count++;  
		   }
	   }
    if(count==2)
    {
	System.out.println(no+ " is prime number" );
	}
    else
    {
    System.out.println(no+ " is not a prime number" );
    }
	}

}
