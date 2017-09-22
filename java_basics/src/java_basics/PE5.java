package java_basics;


import java.util.Scanner;

public class PE5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total no of values : ");
		int n=sc.nextInt();
		int sum=0,tmp=0;
		String str;
		for(int i=0;i<n;i++)
		{
			str=sc.next();
			char c= str.charAt(0);
//			System.out.println(c);
			
			if(Character.isLetter(c))
			{
				System.out.println("Error");
				tmp=1;
				break;
			}
			else
			{	
				int x=Integer.parseInt(str);
				sum+=x;
			}
			
		}
		if(tmp==0)
			System.out.println(sum);

	}

}
