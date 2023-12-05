package baseball;

public class BaseBallTeam {

    private String name;// 名前
    private int win;// 勝利
    private int lose; // 負け
    private int draw; //ドロー
    
public BaseBallTeam(String name,int win, int lose, int draw){
    this.name = name;
    this.win = win;
    this.lose = lose;
    this.draw = draw;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getWin(){
        return this.win;
    }
    public void setWin(int win){
        this.win = win;
    }

    public int getLose(){
        return this.lose;
    }
    public void setLose(int lose){
        this.lose = lose;
    }

    public int getDraw(){
        return this.draw;
    }
    public void setDraw(int draw){
        this.draw = draw;
    }

    public void report(){

        double rate = getRate();

        System.out.println(name+"の2022年の成績は"+this.win+"勝"+this.lose+"敗"+this.draw+"分、勝率は"+rate+"です。");
    }

    public double getRate(){

        double rate = (double) win / (double)(win + lose);

        return rate;
    }}
    