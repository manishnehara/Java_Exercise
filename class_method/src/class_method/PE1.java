package class_method;

import java.util.Scanner;

public class PE1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=sc.nextLine();
		Function rev=new Function(str);
		String str1=rev.reverse();
		System.out.println(str1);
		rev.palindrome();
	}

}
class Function{
	
	public String str;
	public Function(String str1) {
		str = str1;
	}
	public String reverse() {
		String str1="";
		int length=str.length();
		for(int i=0;i<length;i++)
		{
			str1+=str.charAt(length-1-i);
		}
		return str1;
	}
	public void palindrome()
	{
		String str1=reverse();
		if(str1==str)
			System.out.println("palindrome");
		else 
			System.out.println("Not a palindrome");
//		int length=str.length(),c=0;
//		for(int i=0;i<length/2;i++)
//		{
//			if(str.charAt(i)==str.charAt(length-i-1))
//				c++;
//		}
//		if(c==length/2)
//			System.out.println("Palindrome");
//		else
//			System.out.println("Not a palindrome");
	}

	
}
