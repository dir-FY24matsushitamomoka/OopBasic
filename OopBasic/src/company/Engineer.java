package company;    //派生クラス

public class Engineer extends Employee {    //Employeeクラスを継承するEngineerクラス
	//フィールド・属性	
	String programmingLanguage;    //追加のフィールド
	//コンストラクタと親クラスのコンストラクタを呼び出すためのメソッド
	public Engineer(String name, Department department, String position, int employeeId, String programmingLanguage) {
		super (name, department, position, employeeId);   //親クラスのコンストラクタを呼び出すSuper（）メソッド
		this.programmingLanguage = programmingLanguage;   //このインスタンスのprogrammingLanguageはコンストラクタが受け取る値を代入する変数
		//※コンストラクタはオーバーライドできないからsuperメソッドで呼び出したうえで、programmingLanguageのみを変数定義している
	}
	public void developSoftware() {
		System.out.println ("ソフトウェアを開発します。名前："+ name + "プログラミング言語"+programmingLanguage) ;
		//追加のメソッド
	}
	
	//会議に参加するメソッドをオーバーライド（再定義）
	@Override
	public void joinMeeting () {
		super.joinMeeting();
		System.out.println("技術的な準備を行い、上記の会議に参加します。名前："+name);
	//オーバーライドするときは、親クラスのメソッドを呼び出したうえで、再定義したいメソッドを書く
	}
	
	
}
