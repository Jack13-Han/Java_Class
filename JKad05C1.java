import java.util.Random;

public class JKad05C1 {
    public static void main(String[] args) {
        Random rand = new Random(); // 乱数ジェネレータの生成
        int n = rand.nextInt(10);

        System.out.println("乱数を発生させます！");
        System.out.println(n+"が出ました！");

        if(n %2 == 0){
            System.out.println("偶数でした！");
        }else{
            System.out.println("奇数でした！");
        }
        
    }
}
