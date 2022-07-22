package domain;

public class Test {

	public static void main(String[] args) {
		Employee e=new Employee();
		Student s=new Student();
		Customer c=new Customer();
		
		if(s instanceof Student)
		{
			System.out.println("You got a customer object");
		}else
			System.out.println("You dont have a customer object");
			
	}

}
