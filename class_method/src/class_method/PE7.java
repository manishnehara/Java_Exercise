package class_method;

public class PE7 {

	public static void main(String[] args) {
		
		Long fact;
		int c=0,i=1;
		while(c==0)
		{
			fact=(long) 1;
			for(int j=1;j<=i;j++)
			{
				fact*=j;
			}
			if(fact > Integer.MAX_VALUE)
			{
				System.out.println("The factorial of "+i +" is out of range.");
				System.exit(0);
			}
			System.out.println("The factorial of "+i+" is :"+fact);
			i++;
		}

	}

}
