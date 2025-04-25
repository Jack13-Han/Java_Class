/*
	課題名：JSample03X
	作成日：2024/04/16
	作成者：田中太郎
*/
public class JSample03X {
	// xの値を表示
	public static void printValue(int x) {
        for (int i = 1; i < 10; i++) {
            System.out.print("\t"+ x*i);
        }
        System.out.println();
	}
	// mainメソッド
	public static void main(String[] args) {
		printValue(1);			// 引数xに1を渡す
		printValue(2);			// 引数xに2を渡す
		printValue(3);			// 引数xに3を渡す
	}
}
