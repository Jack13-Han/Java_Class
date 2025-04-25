
import java.util.*;

public class JKad04C {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        String user_name;

        System.out.println("あなたのお名前は？＞");
        user_name = name.nextLine();
        System.out.println(user_name+"さん、こんにちは！\r");

        System.out.println("年齢はいくつ？＞");
        int age= name.nextInt() ;
        System.out.println(age+"歳なのね！");

    }
}
