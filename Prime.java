
public class Prime {

	public static void main(String[] args) {
		int n=1,i,count=0;
		
		for(i = 1;i<=n;i++) {
			
			if(n%i==0)
			{
				count++;
			}
		}
		if(n==0||n==1) {
			System.out.println("not prime");
		}
		else if (count>2)
		{
		System.out.println("not prime");
	}
		else
		{   
			System.out.println("prime");
		}
	}
}

