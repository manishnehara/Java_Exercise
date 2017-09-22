package class_method;

class Member{
	int Age;
	double Salary;
	String Name;
	public Member(String name,int age,double d) {
		Age=age;
		Salary=d;
		Name=name;
	}
	public void print_details()
	{
		System.out.println("Members Name : "+Name);
		System.out.println("Members Age : "+Age);
		System.out.println("Members Salary : "+Name);
		
	}
	 
}

public class PE3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member emp=new Member("Harry Potter",30,2500.3);
		emp.print_details();
		
	}

}

