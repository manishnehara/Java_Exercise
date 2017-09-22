package class_method;

import java.util.Scanner;

public class PE2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		Number fun=new Number(num);
		int tmp=fun.power();
		if(tmp==1)
			System.out.println("It is power of 4");
		else 
			System.out.println("It is not power of 4");

	}

}
class Number{
	int value;
	public Number(int num)
	{
		value=num;
	}
	
	public int power()
	{
		if(value == 0)
		    return 0;
		  while(value != 1)
		  {    
		   if(value%4 != 0)
		      return 0;
		    value = value/4;      
		  }
		  return 1;
	}
}
