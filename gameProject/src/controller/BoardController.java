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
}
