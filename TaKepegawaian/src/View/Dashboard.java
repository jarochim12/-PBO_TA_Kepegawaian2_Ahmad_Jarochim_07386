/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import Entity.*;
import Controler.*;
import Model.ModelKepegawaian;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Font;
import java.util.ArrayList;
/**
 *
 * @author msi pc
 */
public class Dashboard {
    
    public static Gaji gaji = new Gaji();
    public static ArrayList<ModelKepegawaian> conpeg = new ArrayList();
    JFrame FrameMenu = new JFrame();
    JLabel top, menu;
    JButton datapegawai,gajipegawai ;
    
    public Dashboard(){
    FrameMenu.setSize(500,400);
    FrameMenu.setLayout(null);
    FrameMenu.getContentPane().setBackground(Color.blue);
    top = new JLabel("**PT.UBS**");
    top.setBounds(200, 110, 100,100);
    top.setFont(new Font("TIMES NEW ROMAN",Font.BOLD, 50));
    FrameMenu.add(top);
    
    menu = new JLabel("---------MENU UTAMA---------");
    menu.setBounds(40, 50, 40, 50);
    menu.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,30));
    FrameMenu.add(menu);
    
    datapegawai = new JButton("DATA PEGAWAI");
    datapegawai.setBounds(80, 80, 80, 80);
    datapegawai.setBackground(Color.GRAY);
    FrameMenu.add(datapegawai);
    
    gajipegawai = new JButton("GAJI PEGAWAI");
    gajipegawai.setBounds(80, 80, 80, 80);
    gajipegawai.setBackground(Color.GRAY);
    FrameMenu.add(gajipegawai);
    
    FrameMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    FrameMenu.setVisible(true);
    FrameMenu.setLocationRelativeTo(null);
    
    datapegawai.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
                ModelKepegawaian pegawai= new ModelKepegawaian();
                FrameMenu.dispose();
            }
        });
    gajipegawai.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae){
          Gaji gajipegawai = new Gaji();
          FrameMenu.dispose();
        } 
      });  
    }           
}
        
