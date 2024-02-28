public class PrimeNumber 
{
  public static void main(String[] args) 
  {
	int n,i,count=0;
	n=49;
	for(i=1;i<=n;i++)
	{
		if(n%i==0)
		count++;
	}
	if(count==2)
	System.out.print("It is a prime number");
	else
	System.out.print("It is not a prime number");
	
	}	
	
  }