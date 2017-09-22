package class_method;

import java.util.Scanner;
class student{
	public double average(int []num,int n)
	{
		 double sum=0;
		for(int i=0;i<num.length;i++)
			sum+=num[i];
		double avg=sum/num.length;
		return avg;
	}
	public int minimum(int []num)
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<num.length ;i++)
		{
			if(min > num[i])
				min=num[i];
		}
		return min;
	}
	public int maximum(int []num)
	{
		int max=0;
		for(int i=0;i<num.length ;i++)
		{
			if(max < num[i])
				max=num[i];
		}
		return max;
	}
}
public class PE6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter no. of students : ");
		int n=sc.nextInt();
		int []grades=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the grade for student"+i+1+" ");
			grades[i]=sc.nextInt();
		}
		System.out.println();
		student st=new student();
		System.out.println("The average is :" +st.average(grades, n));
		System.out.println("The minimum is :"+st.minimum(grades));
		System.out.println("The maximum is :"+st.maximum(grades));
		
		

	}

}
