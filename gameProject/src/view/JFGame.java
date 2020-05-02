package view;

import controller.BoardController;
import controller.PlayerController;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import models.Player;

public class JFGame extends javax.swing.JFrame {

    private Player player1, player2;
    private PlayerController playerController = new PlayerController();
    private BoardController boardController = new BoardController();
    private String[][] symbols = new String[3][3];
    private String symbol = "X";
    private int contPlays = 0;

    public JFGame() {
        initComponents();
        initialGame();
    }

    private void initialGame() {
        loadSimbols();
        player1 = playerController.create(lblSimbol1.getText(), 1);
        player2 = playerController.create(lblSimbol2.getText(), 2);

        while (player1.getNickname().equals(player2.getNickname())) {
            JOptionPane.showMessageDialog(null, "Nickname ja existe, tente outro.", "Erro", JOptionPane.ERROR_MESSAGE);
            player2 = playerController.create(lblSimbol2.getText(), 2);
        }

        txtNickname1.setText(player1.getNickname());
        txtNickname2.setText(player2.getNickname());
        loadPunctuation();
    }

    private void updatePlayers() {
        loadData();
        player1 = playerController.update(player1, player1);
        player2 = playerController.update(player2, player2);
    }

    private void loadData() {
        player1.setNickname(txtNickname1.getText());
        player1.setSymbol(lblSimbol1.getText());
        player2.setNickname(txtNickname2.getText());
        player2.setSymbol(lblSimbol2.getText());
    }

    private void loadSimbols() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                symbols[i][j] = "E";
            }
        }
    }

    private void loadPunctuation() {
        lblScorePlayer1.setText(player1.getNickname() + ": " + String.valueOf(player1.getScore()));
        lblScorePlayer2.setText(player2.getNickname() + ": " + String.valueOf(player2.getScore()));
    }

    private void changeSimbol(JButton btn) {
        btn.setText(symbol);
        btn.setEnabled(false);
        symbol = boardController.changeSymbol(symbol);
    }

    private void enabledButtons(boolean flag) {
        btn1.setEnabled(flag);
        btn2.setEnabled(flag);
        btn3.setEnabled(flag);
        btn4.setEnabled(flag);
        btn5.setEnabled(flag);
        btn6.setEnabled(flag);
        btn7.setEnabled(flag);
        btn8.setEnabled(flag);
        btn9.setEnabled(flag);
    }

    private void cleanTextButtons() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
    }

    private void changeSymbolPlayer() {
        lblSimbol1.setText(boardController.changeSymbol(lblSimbol1.getText()));
        lblSimbol2.setText(boardController.changeSymbol(lblSimbol2.getText()));
    }

    private void resertGame() {
        enabledButtons(true);
        cleanTextButtons();
        loadSimbols();
        symbol = "X";
        contPlays = 0;

    }

    private void setScore(Player playerWinner) {
        if (player1.getNickname().equals(playerWinner.getNickname())) {
            player1.setScore(1);
        } else {
            player2.setScore(1);
        }
        loadPunctuation();
    }

    private void changePlays() {
        contPlays++;
        Player playerWinner;

        if (contPlays >= 5) {
            playerWinner = playerController.winner(player1, player2, symbols);
            if (playerWinner != null) {
                JOptionPane.showMessageDialog(null, "O vencedor e: " + playerWinner.getNickname(), "Vencedor", JOptionPane.WARNING_MESSAGE);
                setScore(playerWinner);
                resertGame();
            }
        }
        if (contPlays == 9) {
            JOptionPane.showMessageDialog(null, "Empate. Tente novamente!", "Empate", JOptionPane.WARNING_MESSAGE);
            resertGame();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panBoard = new javax.swing.JPanel();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        lblSimbol1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSimbol2 = new javax.swing.JLabel();
        txtNickname2 = new javax.swing.JTextField();
        txtNickname1 = new javax.swing.JTextField();
        lblScorePlayer2 = new javax.swing.JLabel();
        lblPunctuation = new javax.swing.JLabel();
        lblScorePlayer1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panBoard.setBackground(new java.awt.Color(224, 224, 224));
        panBoard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setFont(new java.awt.Font("Chiller", 1, 100)); // NOI18N
        btn3.setBorder(null);
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.setFocusable(false);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        panBoard.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 150, 120));

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setFont(new java.awt.Font("Chiller", 1, 100)); // NOI18N
        btn1.setBorder(null);
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.setFocusable(false);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        panBoard.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, 120));

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setFont(new java.awt.Font("Chiller", 1, 100)); // NOI18N
        btn2.setBorder(null);
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.setFocusable(false);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        panBoard.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 150, 120));

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setFont(new java.awt.Font("Chiller", 1, 100)); // NOI18N
        btn4.setBorder(null);
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.setFocusable(false);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        panBoard.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 150, 120));

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setFont(new java.awt.Font("Chiller", 1, 100)); // NOI18N
        btn5.setBorder(null);
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.setFocusable(false);
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        panBoard.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 150, 120));

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.setFont(new java.awt.Font("Chiller", 1, 100)); // NOI18N
        btn6.setBorder(null);
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.setFocusable(false);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        panBoard.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 150, 120));

        btn7.setBackground(new java.awt.Color(255, 255, 255));
        btn7.setFont(new java.awt.Font("Chiller", 1, 100)); // NOI18N
        btn7.setBorder(null);
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.setFocusable(false);
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        panBoard.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 150, 120));

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.setFont(new java.awt.Font("Chiller", 1, 100)); // NOI18N
        btn8.setBorder(null);
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.setFocusable(false);
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        panBoard.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 150, 120));

        btn9.setBackground(new java.awt.Color(255, 255, 255));
        btn9.setFont(new java.awt.Font("Chiller", 1, 100)); // NOI18N
        btn9.setBorder(null);
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.setFocusable(false);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        panBoard.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 150, 120));

        lblSimbol1.setFont(new java.awt.Font("Chiller", 1, 70)); // NOI18N
        lblSimbol1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSimbol1.setText("X");
        lblSimbol1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSimbol1MouseClicked(evt);
            }
        });
        panBoard.add(lblSimbol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 60));

        jLabel2.setFont(new java.awt.Font("Charlemagne Std", 0, 18)); // NOI18N
        jLabel2.setText("Vs");
        panBoard.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        lblSimbol2.setFont(new java.awt.Font("Chiller", 1, 70)); // NOI18N
        lblSimbol2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSimbol2.setText("O");
        lblSimbol2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSimbol2MouseClicked(evt);
            }
        });
        panBoard.add(lblSimbol2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 60, 60));

        txtNickname2.setBackground(new java.awt.Color(224, 224, 224));
        txtNickname2.setFont(new java.awt.Font("Charlemagne Std", 1, 24)); // NOI18N
        txtNickname2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNickname2.setToolTipText("");
        txtNickname2.setBorder(null);
        txtNickname2.setEnabled(false);
        txtNickname2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNickname2MouseClicked(evt);
            }
        });
        txtNickname2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNickname2KeyPressed(evt);
            }
        });
        panBoard.add(txtNickname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 160, 30));

        txtNickname1.setBackground(new java.awt.Color(224, 224, 224));
        txtNickname1.setFont(new java.awt.Font("Charlemagne Std", 1, 24)); // NOI18N
        txtNickname1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNickname1.setToolTipText("");
        txtNickname1.setBorder(null);
        txtNickname1.setEnabled(false);
        txtNickname1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNickname1MouseClicked(evt);
            }
        });
        txtNickname1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNickname1KeyPressed(evt);
            }
        });
        panBoard.add(txtNickname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 160, 30));

        lblScorePlayer2.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        panBoard.add(lblScorePlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 180, 30));

        lblPunctuation.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        lblPunctuation.setText("Pontuacao:");
        panBoard.add(lblPunctuation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        lblScorePlayer1.setFont(new java.awt.Font("EngraversGothic BT", 0, 18)); // NOI18N
        panBoard.add(lblScorePlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 180, 30));

        getContentPane().add(panBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNickname1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNickname1MouseClicked
        txtNickname1.setEnabled(true);
    }//GEN-LAST:event_txtNickname1MouseClicked

    private void txtNickname1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNickname1KeyPressed
        if (boardController.validateTextField(txtNickname1, evt)) {
            updatePlayers();
            loadPunctuation();
        }
    }//GEN-LAST:event_txtNickname1KeyPressed

    private void txtNickname2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNickname2MouseClicked
        txtNickname2.setEnabled(true);
    }//GEN-LAST:event_txtNickname2MouseClicked

    private void txtNickname2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNickname2KeyPressed
        if (boardController.validateTextField(txtNickname2, evt)) {
            updatePlayers();
            loadPunctuation();
        }
    }//GEN-LAST:event_txtNickname2KeyPressed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        symbols[0][0] = symbol;
        changeSimbol(btn1);
        changePlays();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        symbols[0][1] = symbol;
        changeSimbol(btn2);
        changePlays();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        symbols[0][2] = symbol;
        changeSimbol(btn3);
        changePlays();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        symbols[1][0] = symbol;
        changeSimbol(btn4);
        changePlays();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        symbols[1][1] = symbol;
        changeSimbol(btn5);
        changePlays();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        symbols[1][2] = symbol;
        changeSimbol(btn6);
        changePlays();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        symbols[2][0] = symbol;
        changeSimbol(btn7);
        changePlays();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        symbols[2][1] = symbol;
        changeSimbol(btn8);
        changePlays();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        symbols[2][2] = symbol;
        changeSimbol(btn9);
        changePlays();
    }//GEN-LAST:event_btn9ActionPerformed

    private void lblSimbol1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSimbol1MouseClicked
        if (contPlays == 0) {
            changeSymbolPlayer();
            updatePlayers();
            loadPunctuation();
        } else {
            JOptionPane.showMessageDialog(null, "Nao e possivel trocar o simbolo durante a partida", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lblSimbol1MouseClicked

    private void lblSimbol2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSimbol2MouseClicked
        if (contPlays == 0) {
            changeSymbolPlayer();
            updatePlayers();
            loadPunctuation();
        } else {
            JOptionPane.showMessageDialog(null, "Nao e possivel trocar o simbolo durante a partida", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lblSimbol2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPunctuation;
    private javax.swing.JLabel lblScorePlayer1;
    private javax.swing.JLabel lblScorePlayer2;
    private javax.swing.JLabel lblSimbol1;
    private javax.swing.JLabel lblSimbol2;
    private javax.swing.JPanel panBoard;
    private javax.swing.JTextField txtNickname1;
    private javax.swing.JTextField txtNickname2;
    // End of variables declaration//GEN-END:variables
}
