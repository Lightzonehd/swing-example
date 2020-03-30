package com.java.swing;

import com.java.swing.ui.MainFrame;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new MainFrame().setVisible(true));
    }
}
