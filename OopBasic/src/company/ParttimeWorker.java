package company;


public class ParttimeWorker implements Woekable{
//フィールド
	protected final String name;
	private final Department department; 
	
//コンストラクタ
public ParttimeWorker(String name, Department department) {
        this.name = name;
        this.department = department;
    }

//働くメソッドを実装
@Override
public void work() {
    System.out.println("アルバイトとして働きます。名前：" + name + slogan);  //インターフェイスで定義したメソッドをオーバーライド（再定義）
}
	
}
