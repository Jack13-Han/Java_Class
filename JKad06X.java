import java.util.*;

public class JKad06X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("数当てゲーム！");
        
        int ball = ran.nextInt(101);    //    ၀ ကနေ ၁၀၀ အထိ Randon တွေထုတ်မယ်
        int y = 1;
        int x= -1;  //x ကို -1 ပေးရချင်းမှာ ၀ နဲ့ မညီချင်လို့ ပေးထားတာဖြစ်ပါတယ်
       
       
        while (ball != x) {  //ball က ထ နဲ့ မညီရင် Loop အမြဲတမ်ဖြစ်နေမယ်
            System.out.print(y+" 回目：数値を入力してください>");
             x = in.nextInt(); 

             if (ball < x) {
                 System.out.println(x+"より小さいです！");
             }
             if(ball > x){
                System.out.println(x+"より大きいです！");
             }
             if (ball ==x ) {
                 System.out.println("正解しました！");
             }

             y++;

        }
        

    }
}
