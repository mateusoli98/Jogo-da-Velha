package models;

public class Player {

    private String nickname, symbol;
    private int score;

    public Player(String nickname, String symbol) {
        this.nickname = nickname;
        this.symbol = symbol;
        this.score = 0;
    }
    
    public Player() {
        this.nickname = "";
        this.symbol = "";
        this.score = 0;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += score;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
