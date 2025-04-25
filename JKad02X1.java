public class JKad02X1{
	public static void main(String[] args){
		//int n = 10;
		//int sum=0;
		
		//System.out.println("n の値は");
		//System.out.println(n);
		
		//System.out.println("*** 1 からn まで加算します！ ***");
		//System.out.println("結果は");
		
		
		//for (int i =0 ;i<=n;++i){
		//	sum +=i;
			
		//}
		//System.out.println(sum);
	
		
		//int y=0;
		//int x=100;
		//System.out.println("n の値は");
		//System.out.println(x);	
		
		//System.out.println("*** 1 からn まで加算します！ ***");
		//System.out.println("結果は");
		
		//for (int i =1 ;i <=x ; ++i){
		//	y += i;
		//}
		//System.out.println(y);
		
		
		loop(10);
		loop(100);
		
	}
	
	public static void loop(int n){
		System.out.println("n の値は");
		System.out.println(n);	
		
		System.out.println("*** 1 からn まで加算します！ ***");
		System.out.println("結果は");
		int sum = 0;
		for (int i =0 ;i<=n;++i){
			sum +=i;
		}
		System.out.println(sum);
	}
}