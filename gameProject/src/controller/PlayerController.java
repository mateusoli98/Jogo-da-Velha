package controller;

import javax.swing.JOptionPane;
import models.Player;

public class PlayerController {

    public Player create(String simbol) {
        String nickname = JOptionPane.showInputDialog("Digite seu Nickname: ");
        return new Player(nickname, simbol);
    }

    public Player update(Player player, Player playerUpdate) {
        player.setNickname(playerUpdate.getNickname());
        player.setSimbol(playerUpdate.getSimbol());
        return player;
    }
}
