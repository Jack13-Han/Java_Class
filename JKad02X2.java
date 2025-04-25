public class JKad02X1{
	public static void main(String[] args){
		
		loop(10);
		loop(100);
		
	}
	
	public static void loop(int n){
		System.out.println("n �̒l��");
		System.out.println(n);	
		
		System.out.println("*** 1 ����n �܂ŉ��Z���܂��I ***");
		System.out.println("���ʂ�");
		int sum = 0;
		for (int i =0 ;i<=n;++i){
			sum +=i;
		}
		System.out.println(sum);
	}
}