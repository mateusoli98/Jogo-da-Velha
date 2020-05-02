package controller;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class BoardController {

    public boolean validateTextField(JTextField txtField, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 10) {
            if (!txtField.getText().trim().isEmpty()) {
                txtField.setBorder(null);
                txtField.setEnabled(false);
                return true;
            } else {
                txtField.setBorder(new LineBorder(Color.RED));
                JOptionPane.showMessageDialog(null, "E necessario um nickname", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return false;
    }

    public String changeSymbol(String symbol) {
        return symbol.equals("X") ? "O" : "X";
    }

    public String winnerSymbol(String symbols[][]) {
        String valueLine = checkLine(symbols);
        String valueColumn = checkColumn(symbols);
        String valueDiagonal = checkDiagonal(symbols);

        if (valueLine != null) {
            return valueLine;
        }
        if (valueColumn != null) {
            return valueColumn;
        }
        if (valueDiagonal != null) {
            return valueDiagonal;
        }

        return null;
    }

    private String checkLine(String symbols[][]) {

        if ((symbols[0][0].equals(symbols[0][1]) && symbols[0][0].equals(symbols[0][2]) && !symbols[0][0].equals("E"))) {
            return symbols[0][0];
        }
        if ((symbols[1][0].equals(symbols[1][1]) && symbols[1][0].equals(symbols[1][2])) && !symbols[1][0].equals("E")) {
            return symbols[1][0];
        }
        if ((symbols[2][0].equals(symbols[2][1]) && symbols[2][0].equals(symbols[2][2])) && !symbols[2][0].equals("E")) {
            return symbols[2][0];
        }

        return null;
    }

    private String checkColumn(String symbols[][]) {
        if ((symbols[0][0].equals(symbols[1][0]) && symbols[0][0].equals(symbols[2][0]) && !symbols[0][0].equals("E"))) {
            return symbols[0][0];
        }
        if ((symbols[0][1].equals(symbols[1][1]) && symbols[0][1].equals(symbols[2][1])) && !symbols[0][1].equals("E")) {
            return symbols[0][1];
        }
        if ((symbols[0][2].equals(symbols[1][2]) && symbols[0][2].equals(symbols[2][2])) && !symbols[0][2].equals("E")) {
            return symbols[0][2];
        }
        return null;
    }

    private String checkDiagonal(String symbols[][]) {
        if ((symbols[0][0].equals(symbols[1][1]) && symbols[0][0].equals(symbols[2][2]) && !symbols[0][0].equals("E"))) {
            return symbols[0][0];
        }
        if ((symbols[0][2].equals(symbols[1][1]) && symbols[0][2].equals(symbols[2][0])) && !symbols[0][2].equals("E")) {
            return symbols[0][2];
        }
        return null;
    }
}
