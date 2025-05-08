
import java.util.*;

public class JKad06S2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("9 桁までの正の整数を入力してください>");
        int x= in.nextInt();
        String z ="1";
        while(x>1){
          int y =  x%2; //2真数 ကို ပြောင်းဖို့အတွက် တန်ဖိုးကို  2 နဲ့စားဖို့လိုအပ်တယ် အကြွင်း​တွေကိုထုတ်ချင်လို့ ဒီလိုရေးထားတာ
          x/=2;  // 
            System.out.println(z+" の位は"+y);
            z+=0;
        }

    }
}
