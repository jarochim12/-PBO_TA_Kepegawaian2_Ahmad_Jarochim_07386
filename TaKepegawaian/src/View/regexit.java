package View;

import Controler.*;
import View.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Font;

/**
 *
 * @author Yoga Pratama
 */
public class regexit {
JFrame Frameregexit = new JFrame();
    JLabel judul;
    JButton reg, exit;

public regexit(){
    Frameregexit.setSize(700, 300);
    Frameregexit.setLayout(null);
    Frameregexit.getContentPane().setBackground(Color.WHITE);
    judul = new JLabel("*****PT.UBS*****");
    judul.setBounds(150, 10, 600, 50);
    judul.setFont(new Font("Times New Roman", Font.BOLD, 50));
    Frameregexit.add(judul);
    reg = new JButton("REGISTRASI");
    reg.setBounds(250, 100, 180, 40);
    reg.setBackground(Color.WHITE);
    Frameregexit.add(reg);
    exit = new JButton("EXIT");
    exit.setBounds(250, 150, 180, 40);
    exit.setBackground(Color.WHITE);
    Frameregexit.add(exit);
    Frameregexit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Frameregexit.setVisible(true);
    Frameregexit.setLocationRelativeTo(null);
        
    reg.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            RegLogGUI regis = new RegLogGUI();
            Frameregexit.dispose();
        } 
    });
        
    exit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            JOptionPane.showMessageDialog(null, "Anda Berhasil Keluar", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            Frameregexit.dispose();
        }
    });
    }   
}
