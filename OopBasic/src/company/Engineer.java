package company;

public class Engineer extends Employee {
	//フィールド・属性	
	String programmingLanguage;
	//メソッド
	public Engineer(String name, Department department, String position, int employeeId, String programmingLanguage) {
		super (name, department, position, employeeId);
		this.programmingLanguage = programmingLanguage;
		
	}
	public void developSoftware() {
		System.out.println ("ソフトウェアを開発します。名前："+ name + "プログラミング言語"+programmingLanguage) ;

	}
	
	//会議に参加するメソッドをオーバーライド（多重定義）
	@Override
	public void joinMeeting () {
		super.joinMeeting();
		System.out.println("技術的な準備を行い、上記の会議に参加します。名前："+name);
		
	}
	
	
}
