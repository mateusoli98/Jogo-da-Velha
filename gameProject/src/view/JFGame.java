package view;

import controller.BoardController;
import controller.PlayerController;
import javax.swing.JOptionPane;
import models.Player;

public class JFGame extends javax.swing.JFrame {

    private Player player1, player2;
    private PlayerController playerController = new PlayerController();
    private BoardController boardController = new BoardController();

    public JFGame() {
        initComponents();
        initialGame();
    }

    private void initialGame() {
        player1 = playerController.create(lblSimbol1.getText(), 1);
        player2 = playerController.create(lblSimbol2.getText(), 2);
        while (player1.getNickname().equals(player2.getNickname())) {
            JOptionPane.showMessageDialog(null, "Nickname ja existe, tente outro.", "Erro", JOptionPane.ERROR_MESSAGE);
            player2 = playerController.create(lblSimbol2.getText(), 2);
        }
        txtNickname1.setText(player1.getNickname());
        txtNickname2.setText(player2.getNickname());
    }

    private void updatePlayers() {
        loadData();
        playerController.update(player1, player2);
    }

    private void loadData() {
        player1.setNickname(txtNickname1.getText());
        player2.setNickname(txtNickname2.getText());
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
        panBoard.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 150, 120));

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setFont(new java.awt.Font("Chiller", 1, 100)); // NOI18N
        btn1.setBorder(null);
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.setFocusable(false);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panBoard.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, 120));

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setFont(new java.awt.Font("Chiller", 1, 100)); // NOI18N
        btn2.setBorder(null);
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.setFocusable(false);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panBoard.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 150, 120));

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setFont(new java.awt.Font("Chiller", 1, 100)); // NOI18N
        btn4.setBorder(null);
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.setFocusable(false);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panBoard.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 150, 120));

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setFont(new java.awt.Font("Chiller", 1, 100)); // NOI18N
        btn5.setBorder(null);
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.setFocusable(false);
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panBoard.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 150, 120));

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.setFont(new java.awt.Font("Chiller", 1, 100)); // NOI18N
        btn6.setBorder(null);
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.setFocusable(false);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panBoard.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 150, 120));

        btn7.setBackground(new java.awt.Color(255, 255, 255));
        btn7.setFont(new java.awt.Font("Chiller", 1, 100)); // NOI18N
        btn7.setBorder(null);
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.setFocusable(false);
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panBoard.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 150, 120));

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.setFont(new java.awt.Font("Chiller", 1, 100)); // NOI18N
        btn8.setBorder(null);
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.setFocusable(false);
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panBoard.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 150, 120));

        btn9.setBackground(new java.awt.Color(255, 255, 255));
        btn9.setFont(new java.awt.Font("Chiller", 1, 100)); // NOI18N
        btn9.setBorder(null);
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.setFocusable(false);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panBoard.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 150, 120));

        lblSimbol1.setFont(new java.awt.Font("Chiller", 1, 70)); // NOI18N
        lblSimbol1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSimbol1.setText("X");
        panBoard.add(lblSimbol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 60));

        jLabel2.setFont(new java.awt.Font("Charlemagne Std", 0, 18)); // NOI18N
        jLabel2.setText("Vs");
        panBoard.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        lblSimbol2.setFont(new java.awt.Font("Chiller", 1, 70)); // NOI18N
        lblSimbol2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSimbol2.setText("O");
        panBoard.add(lblSimbol2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 60, 60));

        txtNickname2.setBackground(new java.awt.Color(224, 224, 224));
        txtNickname2.setFont(new java.awt.Font("Charlemagne Std", 1, 24)); // NOI18N
        txtNickname2.setText("Jogador 2");
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
        txtNickname1.setText("Jogador 1");
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

        getContentPane().add(panBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNickname1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNickname1MouseClicked
        txtNickname1.setEnabled(true);
    }//GEN-LAST:event_txtNickname1MouseClicked

    private void txtNickname1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNickname1KeyPressed
        if (boardController.validateTextField(txtNickname1, evt)) {
            updatePlayers();
        }
    }//GEN-LAST:event_txtNickname1KeyPressed

    private void txtNickname2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNickname2MouseClicked
        txtNickname2.setEnabled(true);
    }//GEN-LAST:event_txtNickname2MouseClicked

    private void txtNickname2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNickname2KeyPressed
        if (boardController.validateTextField(txtNickname2, evt)) {
            updatePlayers();
        }
    }//GEN-LAST:event_txtNickname2KeyPressed

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
    private javax.swing.JLabel lblSimbol1;
    private javax.swing.JLabel lblSimbol2;
    private javax.swing.JPanel panBoard;
    private javax.swing.JTextField txtNickname1;
    private javax.swing.JTextField txtNickname2;
    // End of variables declaration//GEN-END:variables
}
