package Program;

public class Rangepm {

	public static void main(String[] args) 
	{
		int count1=0;
		int sum=0;
		for(int j=1;j<=100;j++)
		{
			for(int i=0;i<=j;i++)
			{
			if(i%10==0)
			{
				count1++;
			}
			}
			if(count1==2)
			{
			sum=sum+j;
			}
			
		
		}
		

	}

}
