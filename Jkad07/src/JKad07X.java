import java.util.*;


public class JKad07X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("数当てゲーム！");

        int ball = ran.nextInt(100);    //    ၀ ကနေ ၁၀၀ အထိ Randon တွေထုတ်မယ်
        int y = 1;
        int x= -1;  //x ကို -1 ပေးရချင်းမှာ ၀ နဲ့ မညီချင်လို့ ပေးထားတာဖြစ်ပါတယ်

        System.out.print(y+" 回目0 から99 までの数値を入力してください＞>");
        while (ball != x) {  //ball က ထ နဲ့ မညီရင် Loop အမြဲတမ်ဖြစ်နေမယ်

            x = in.nextInt();

            if (ball < x) {
                System.out.println(x+"より小さいです！");
                System.out.print(y+" 回目0 から"+ball+" までの数値を入力してください＞>");
                if (ball< x){
                    int num1= in.nextInt();
                    System.out.println();
                    System.out.print(y+" 回目"+num1+" から"+ball+" までの数値を入力してください＞>");
                }
            }
            if(ball > x){
                System.out.println(x+"より大きいです！");
                System.out.print(y+" 回目0 から"+ball+" までの数値を入力してください＞>");
                System.out.print(y+" 回目0 から"+ball+" までの数値を入力してください＞>");
            }
            if (ball ==x ) {
                System.out.println("正解しました！");
            }

            y++;
        }
    }
}
