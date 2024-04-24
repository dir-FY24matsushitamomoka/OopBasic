package company;  //基底クラス (抽象クラス)

public abstract class Employee implements Woekable {
//フィールド（属性）を定義する変数の宣言
	protected String name;
	protected final Department department;
	private final String position;
	private final int employeeId;
	
//コンストラクター　クラスのインスタンスを作成するさいに呼び出されるメソッド
public Employee (String name,Department department,String position, int employeeId) {
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
	//reportメソッドを呼び出して１を代入
	//int times=1
	
	 // 会議に参加する抽象メソッド
    public abstract void joinMeeting();
    
    // インターフェースで定義したwork()メソッドを実装
    @Override
    public void work() {
        System.out.println("正社員として働きます。名前：" + name + slogan);
    }
    
}

	


