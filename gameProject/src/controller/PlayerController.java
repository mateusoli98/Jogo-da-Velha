package controller;

import javax.swing.JOptionPane;
import models.Player;

public class PlayerController {

    private BoardController boardController = new BoardController();

    public Player create(String symbol, int i) {
        String nickname = JOptionPane.showInputDialog("Digite seu Nickname jogador " + i + ": ");
        return new Player(nickname, symbol);
    }

    public Player update(Player player, Player playerUpdate) {
        player.setNickname(playerUpdate.getNickname());
        player.setSymbol(playerUpdate.getSymbol());
        return player;
    }

    public Player winner(Player player1, Player player2, String symbols[][]) {
        String winnerSymbol = boardController.winnerSymbol(symbols);
        if (winnerSymbol != null) {
            return player1.getSymbol().equals(winnerSymbol) ? player1 : player2;
        }
        return null;
    }
}
