package com.interview.design.singleDuty;

import javax.swing.*;
import java.awt.*;

public class WindowComponent extends JFrame {

    public static void main(String[] args) {
        WindowComponent wc = new WindowComponent();
        wc.createFrame();
    }

    public void createFrame() {
        /**
         * 创建面板
         */
        JPanel topPanel = new JPanel();
        JPanel centerPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        /**
         * 创建按钮
         */
        JButton restartBtn = new JButton("重开");
        JButton speedBtn = new JButton("加速");

        bottomPanel.add(restartBtn);
        bottomPanel.add(speedBtn);

        this.add(topPanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(bottomPanel, BorderLayout.SOUTH);


        this.setTitle("俄罗斯方块");
        this.setSize(300, 600);
        this.setLocation(700, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

}
