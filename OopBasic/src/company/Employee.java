package company;

public class Employee {
//フィールド（属性）を定義する変数の宣言
	String name;
	String department;
	String position;
	int employeeId;
	
//コンストラクター　クラスをインスタンスを作成するさいに呼び出されるメソッド
public Employee (String name,String department,String position, int employeeId) {
	this.name=name;
	this.department=department;
	this.position=position;
	this.employeeId=employeeId;
	
}
//報告メソッド
public void report (int times) {
	System.out.println(times+"回目の報告をします。役職："+position+"、名前："+name);
	
}
//報告メソッド（オーバーロード）
	public void report() {
		report(1);
	}


public class ObjectSample {

	public static void main(String[] args) {
		 // インスタンスの作成
        var employee = new Employee("鈴木", "営業部", "課長", 100);

        // インスタンスメソッドの呼び出し
        employee.report();
        employee.report(2);
    }


	}