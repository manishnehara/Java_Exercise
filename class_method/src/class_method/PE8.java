package class_method;

import java.math.BigInteger;

public class PE8 {

	public static void main(String[] args) {
		Long num;
		int c=0,n=1;
		Long fact=(long) 1;
		System.out.println(Integer.MAX_VALUE);
		while(c==0)
		{
		
			fact=(long) 1;
			for(int j=1;j<=n;j++)
			{
				if(fact >= Long.MAX_VALUE/j)
				{
					System.out.println("The factotial of "+n+" is out of range.");
					System.exit(0);
				}
				fact*=j;

				
			}
	
				System.out.println("The factorial of "+n+" is : "+fact);
			n++;
//			c++;
		}

	}

}
