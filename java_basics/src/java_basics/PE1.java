package java_basics;

import java.util.Scanner;

public class PE1 {

	public static void main(String[] args) {
//		System.out.println("hello world");
//		BufferedReader br=new BufferedReader();
		
		long num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextLong();
//		System.out.println(num);
		long tmp=num,count=0;
		String str=Long.toString(num);
		int length=str.length();
		char[] ch=str.toCharArray();
		for(int i=0;i<length/2;i++)
		{
			if(ch[i]==ch[length-1-i])
				count++;
		}
		int sum=0;
		if(count != length/2)
			System.out.println(num+": is not palindrome");
		else 
		{	
			System.out.print(num +": is palindrome");
			for(int i=0;i<length;i++)
			{
				if(((int)ch[i])%2==0)
					sum+=(int)ch[i];
			
			}
			if(sum>25)
				System.out.println(" and the sum of even numbers is greater than 25");
			else
				System.out.println(" and the sum of even numbers is less than 25");
			
		}
			
	}

}
