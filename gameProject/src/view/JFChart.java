package view;

import java.awt.Color;
import models.Player;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class JFChart extends javax.swing.JFrame {

    public JFChart(Player player1, Player player2, int old) {
        initComponents();
        initChart(player1, player2, old);
    }

    public void initChart(Player player1, Player player2, int old) {
        DefaultPieDataset dpd = new DefaultPieDataset();
        dpd.setValue(player1.getNickname(), player1.getScore());
        dpd.setValue(player2.getNickname(), player2.getScore());
        dpd.setValue("Velha", old);

        JFreeChart chart = ChartFactory.createPieChart("Placar", dpd, true, true, false);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBackground(Color.WHITE);
        panChart.add(chartPanel);
        panChart.validate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panChart = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panChart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panChart;
    // End of variables declaration//GEN-END:variables
}
