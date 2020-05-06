package view;

import java.awt.BorderLayout;
import java.awt.Color;
import models.Player;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class JFChart extends javax.swing.JFrame {

    public JFChart(Player player1, Player player2, int old) {
        initComponents();
        getContentPane().add(panChart);
        panChart.setLayout(new BorderLayout(0, 0));
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout panChartLayout = new javax.swing.GroupLayout(panChart);
        panChart.setLayout(panChartLayout);
        panChartLayout.setHorizontalGroup(
            panChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );
        panChartLayout.setVerticalGroup(
            panChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panChart;
    // End of variables declaration//GEN-END:variables
}
