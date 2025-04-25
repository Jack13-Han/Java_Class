public class JKad03S {
    public static void main(String[] args) {
    final int COFFEE = 290; // コーヒーの値段
    final int DONUT = 270; // ドーナツの値段
    final int SALAD = 380; // サラダの値段
    final int CAKE = 420; // ケーキの値段


    System.out.println("ようこそ！ECC コーヒーへ");
    System.out.println("こちらでお召し上がりですね！");
    System.out.println("--------");

    System.err.println("コーヒー" + "\t"+ "小計："+ COFFEE + "円");
    System.err.println("ドーナツ" + "\t"+ "小計："+ (COFFEE+DONUT) + "円");
    System.err.println("チキンサラダ" + "\t"+ "小計："+ (COFFEE+DONUT+SALAD) + "円");
    System.err.println("チーズケーキ" + "\t"+ "小計："+ (COFFEE+DONUT+SALAD+CAKE) + "円");

    int total =COFFEE+DONUT+SALAD+CAKE;
    int tax  = total / 10;
    System.out.println("--------");
    System.out.println("消費税が "+tax+" 円で支払金額は"+(total+tax)+" 円になります！");

    System.out.println("ありがとうございました！");
    }
}
