package java_basics;

import java.util.Scanner;

public class PE6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		int i=0;
		while(i==0)
		{
			ch=sc.next().charAt(0);
			if(Character.isLetter(ch))
			{
				if(Character.isUpperCase(ch))
					System.out.println("Capital Letter");
				else 
					System.out.println("Small case letter");
			}
			else if(Character.isDigit(ch))
			{
				System.out.println("Digit");
			}
			else
			{
				System.out.println("Special Symbol");
			}
		}

	}

}
