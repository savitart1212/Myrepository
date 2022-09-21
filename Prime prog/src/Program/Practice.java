package Program;

public class Practice {

	public static void main(String[] args)
	{
		int num=6;
		int count1=0;
		for(int i=0;i<=num;i++)
		{
		if(i%10==0)
		{
			count1++;
		}
		}
		if(count1==2)
		{
		System.out.println(num+"is Prime number");	
		}
		else
		{
			System.out.println(num+"is not a Prime number");	
		}

	}

}
