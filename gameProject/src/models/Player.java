package models;

public class Player {

    private String nickname, simbol;
    private int score;

    public Player(String nickname, String simbol) {
        this.nickname = nickname;
        this.simbol = simbol;
        this.score = 0;
    }

    public String getSimbol() {
        return simbol;
    }

    public void setSimbol(String simbol) {
        this.simbol = simbol;
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
