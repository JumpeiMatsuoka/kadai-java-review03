package baseball;

public class Review03 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        BaseBallTeam[] bbta= new BaseBallTeam[6];
        bbta[0] = new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
        bbta[1] = new BaseBallTeam("横浜DeNAベイスターズ",73,68,2);
        bbta[2] = new BaseBallTeam("阪神タイガース",68,71,4);
        bbta[3] = new BaseBallTeam("読売ジャイアンツ",68,72,3);
        bbta[4] = new BaseBallTeam("広島東洋カープ ",66,74,3);
        bbta[5] = new BaseBallTeam("中日ドラゴンズ",66,75,2);

       bbta[0].report();
       bbta[1].report();
       bbta[2].report();
       bbta[3].report();
       bbta[4].report();
       bbta[5].report();
       }
}
             
    


