
public class Review01 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int nedan=1500;
        double Tax = 0.1;
        int result = tax(nedan,Tax);
        
        System.out.println(nedan+"円商品の税込価格は"+(nedan+result)+"円（消費税は"+result+"円）です。");
        }
        public static int tax(int nedan,double Tax){
        int result = (int)(nedan*Tax);
        return result;}
        }
