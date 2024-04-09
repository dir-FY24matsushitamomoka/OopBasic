package company;

public class Employee {
//フィールド（属性）を定義する変数の宣言
	protected String name;
	private final String department;
	private final String position;
	private final int employeeId;
	
//コンストラクター　クラスのインスタンスを作成するさいに呼び出されるメソッド
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


//報告メソッド（オーバーロード）　メソッドは同じだけど、引数が異なる
	public void report() {
		report(1);
	}
	//int times=1
	
	 // 会議に参加するメソッド
    public void joinMeeting() {
        department.meeting();
        System.out.println("→上記の会議に参加します。部署：" + department.getName() + "名前：" + name);
    }
}




