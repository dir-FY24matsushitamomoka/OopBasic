package company;     //実行クラス　コンストラクタを呼んで具体的なデータをいれこみ、オブジェクト化するクラス

public class ObjectSample {

	public static void main(String[] args) {
		//インスタンスの作成、コンストラクタを呼んで作ってもらう
        var department = new Department("営業部", "xx", 1000000);
        var employee = new Employee("鈴木", department, "課長", 100); 
        
        //varじゃなくても、Department型としてもよい。可読性重視でvarにしているだけ。
   
        
     // インスタンスメソッドの呼び出し
        employee.report();      //レポートメソッドはpositionと名前だけを受け取る
        employee.report(2);
        employee.joinMeeting();
        
        // 1行空けるときには（""）と書く
        System.out.println("");
        
        // インスタンスの作成
        var devDepartment = new Department("開発部", "yy", 0);
        var engineer = new Engineer("田中", devDepartment, "一般社員", 88, "Java");
        
        // インスタンスメソッドの呼び出し
        engineer.report();
        engineer.joinMeeting();
        engineer.developSoftware();

        //ポリモーフィズムの確認
        Employee projectManager = new Engineer("佐藤", devDepartment, "PM", 99, "Java");
        //Employeeクラス（基底クラス）の変数にEngineer（派生クラス）のオブジェクトは代入できる
        //Engineerのコンストラクタを呼び、インスタンス化している
        //projectManagerとは従業員（Employee）の型
        
        //インスタンスメソッドの呼びだし
        projectManager.report();
        projectManager.joinMeeting();
        //基底クラスで定義しているメソッドは同じ名前で呼びだし可能
        
        if (projectManager instanceof Engineer) {
        	//projectManagerというインスタンスをもとにdevelopSoftwareメソッド（Engineerクラスで定義）を使いたい
        	//そのためにオブジェクト（projectManager）が派生クラスのオブジェクトであるかをチェックする
        	//trueならdevelopSoftwareメソッド（定義元の派生クラス）を呼び出す
        	((Engineer)projectManager).developSoftware ();
        //if文でinstanceofキーワードを利用して、projectmanagerがengineerクラスかを判定する。：変数 instanceof Engineerでチェックできる
        //trueならprojectManagerをEngineer型に変換し（キャスト）、developSoftwareメソッドを呼ぶ
        	
        }
        
        // 1行空ける
        System.out.println("");

        // アルバイトインスタンスの作成
        var parttimeWorker = new ParttimeWorker("太田", department);
        
        // 実装したメソッドの呼び出し
        ((Woekable) employee).work();
        ((Woekable) engineer).work();
        ((Woekable) projectManager).work();
        ((Woekable) parttimeWorker).work();

    } 
        
	}	