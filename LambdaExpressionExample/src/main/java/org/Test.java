package org;

public class Test {

	public static void main(String[] args) {
	
//		Employee emp = new Employee();
//		emp.doSomething();
//		emp.work();
//		emp.getWorkHours();

// ---------------------------------------------------------------------		
		
		//LambdaExp
		//leftside -> rightside
		//() -> Body{}
		
		
// ---------------------------------------------------------------------
		Doable do1 = new Doable() {
			public void doSomething()
			{
				System.out.println("Employees do something to make their living");
			}
		};
		do1.doSomething();
		Doable do2 = () -> { System.out.println("Employees do something to make their living"); };
		do2.doSomething();
		
// ---------------------------------------------------------------------
		Transferrable tr = new Transferrable() {
			public void transfer() {
				System.out.println("Employees do travel for work");
			}
		};
		tr.transfer();
		Transferrable tr1 = () -> { System.out.println("Employees do travel for work"); };
		tr1.transfer();
// ---------------------------------------------------------------------
		Workable wk = new Workable () {
			public void work() {
				System.out.println("Employees can work on diff projects based on their skillsset");
			}
			public void getWorkHours() {
				System.out.println("Employees can work on the same projects based on their skillsset");
			}
};
		wk.work();
		wk.getWorkHours();

	}
}
