package class_method;

import java.util.Scanner;

public class PE5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number (check isEven) :");
		int num=sc.nextInt();
		EvenNumTest even= new EvenNumTest();
		System.out.println(EvenNumTest.isEven(num));
	}

}
class EvenNumTest{
	int number;
	public static boolean isEven(int num)
	{
		if(num%2==0)
			return true;
		else return false;
	}
}
