package controller;

import javax.swing.JOptionPane;
import models.Player;

public class PlayerController {

    public Player create(String simbol, int i) {
        String nickname = JOptionPane.showInputDialog("Digite seu Nickname jogador " + i + ": ");
        return new Player(nickname, simbol);
    }

    public Player update(Player player, Player playerUpdate) {
        player.setNickname(playerUpdate.getNickname());
        player.setSimbol(playerUpdate.getSimbol());
        return player;
    }
}
