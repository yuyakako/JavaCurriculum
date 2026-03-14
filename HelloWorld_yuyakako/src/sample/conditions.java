package sample;

public class conditions {

	public static void main(String[] args) {
		//条件判定
		boolean isJavaFun = true;
		boolean isRainy = false;
		System.out.println(isJavaFun);
		System.out.println(isRainy);
		
		//簡潔な例
		boolean isLogin = true;
		if(isLogin) {
		System.out.println("ログイン済み");
		}
		
		//比較演算子
		int a = 10;
		int b = 5;
		System.out.println(a > b); // true
		System.out.println(a == b);	// false
		System.out.println(a != b);	// true
		
		//論理演算子
		boolean condition_1 = (10 > 5);	//true
		boolean condition_2 = (8 < 20);	//true
		System.out.println(condition_1 && condition_2);	//true
		System.out.println((10 >5) && (8>20));	//false
		System.out.println((10 > 5) || (8 > 20));	//true
		System.out.println((10 < 5) || (8 > 20));	//false
		boolean isSunny =true;
		System.out.println(!isSunny);	//false
	}

}
