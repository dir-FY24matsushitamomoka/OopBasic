package company;

public class ObjectSample {

	public static void main(String[] args) {
		var employee=new Employee("鈴木", "営業部","課長", 100);
		employee.report();
		employee.report(2);

	}	
}