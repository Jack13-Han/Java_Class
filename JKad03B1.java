public class JKad03B1{
    public static void main(String[] args) {
        int x=5;
        
        System.out.println("変数x の値を表示します！");
        System.out.println("x");
        System.out.println("変数x に14 を足します！");
        // x=x+14;
        System.out.println(x+=14);
        System.out.println("変数x から3 を引きます！");
        // x=x-3;
        System.out.println(x-=3);
        System.out.println("変数x に7 をかけます！");
        // x=x*7;
        System.out.println(x*=7);
        System.out.println("変数x を10 で割ります！");
        // x=x/10;
        System.out.println(x/=10);
        System.out.println("変数x を4 で割った余りを求めます！");
        System.out.println(x%=4);

    }
};