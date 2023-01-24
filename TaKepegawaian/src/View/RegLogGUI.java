package View;

import Controler.*;
import Entity.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Yoga Pratama
 */
public class RegLogGUI {
    public static AdminEntity admin = new AdminEntity();
    public static ArrayList<AdminEntity> Arrayadmin = new ArrayList<>();
    JFrame FrameRegLog = new JFrame();
    JLabel login, regis, top;
    JTextField textidadmin, textnamaadmin, textusernamereg, textusernamelog;
    JLabel labelidadmin, labelnamaadmin, labelusernamereg, labelpasswordreg, labelusernamelog, labelpasswordlog;
    JButton log, reg;
    JPasswordField passwordregis, passwordlog;
    
public RegLogGUI(){
    FrameRegLog.setSize(800, 400);
    FrameRegLog.setLayout(null);
    FrameRegLog.getContentPane().setBackground(Color.WHITE);
    top = new JLabel("*****PT.UBS*****");
    top.setBounds(200, 10, 600, 50);
    top.setFont(new Font("Times New Roman", Font.BOLD, 50));
    FrameRegLog.add(top);
    regis = new JLabel("REGISTRASI");
    regis.setBounds(100, 50, 200, 100);
    regis.setFont(new Font("Times New Roman", Font.BOLD, 30));
    FrameRegLog.add(regis);
    login = new JLabel("LOGIN");
    login.setBounds(450, 50, 200, 100);
    login.setFont(new Font("Times New Roman", Font.BOLD, 30));
    FrameRegLog.add(login);
     
    labelidadmin = new JLabel("ID ADMIN");
    labelidadmin.setBounds(100, 120, 100, 30);
    FrameRegLog.add(labelidadmin);
    textidadmin = new JTextField();
    textidadmin.setBounds(200, 120, 200, 30);
    FrameRegLog.add(textidadmin);
    
    labelnamaadmin = new JLabel("NAMA ADMIN");
    labelnamaadmin.setBounds(100, 160, 100, 30);
    FrameRegLog.add(labelnamaadmin);
    textnamaadmin = new JTextField();
    textnamaadmin.setBounds(200, 160, 200, 30);
    FrameRegLog.add(textnamaadmin);
    
    labelusernamereg = new JLabel("USERNAME");
    labelusernamereg.setBounds(100, 200, 100, 30);
    FrameRegLog.add(labelusernamereg);
    textusernamereg = new JTextField();
    textusernamereg.setBounds(200, 200, 200, 30);
    FrameRegLog.add(textusernamereg);
    
    labelpasswordreg = new JLabel("PASSWORD");
    labelpasswordreg.setBounds(100, 240, 100, 30);
    FrameRegLog.add(labelpasswordreg);
    passwordregis = new JPasswordField();
    passwordregis.setBounds(200, 240, 200, 30);
    FrameRegLog.add(passwordregis);
    
    labelusernamelog = new JLabel("USERNAME");
    labelusernamelog.setBounds(450, 120, 100, 30);
    FrameRegLog.add(labelusernamelog);
    textusernamelog = new JTextField();
    textusernamelog.setBounds(550, 120, 200, 30);
    FrameRegLog.add(textusernamelog);
    
    labelpasswordlog = new JLabel("PASSWORD");
    labelpasswordlog.setBounds(450, 160, 100, 30);
    FrameRegLog.add(labelpasswordlog);
    passwordlog = new JPasswordField();
    passwordlog.setBounds(550, 160, 200, 30);
    FrameRegLog.add(passwordlog);
    
    reg = new JButton("REGISTER");
    reg.setBounds(200, 300, 100, 30);
    reg.setBackground(Color.WHITE);
    FrameRegLog.add(reg);
    
    log = new JButton("LOGIN");
    log.setBounds(550, 230, 100, 30);
    log.setBackground(Color.WHITE);
    FrameRegLog.add(log);
    FrameRegLog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    FrameRegLog.setVisible(true);
    FrameRegLog.setLocationRelativeTo(null);
        
    reg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 try {
                    String idadmin = textidadmin.getText();
                    admin.setId(idadmin);
                    String namaadmin = textnamaadmin.getText();
                    admin.setNama(namaadmin);
                    String username = textusernamereg.getText();
                    admin.setNama(username);
                    String password = passwordregis.getText();
                    admin.setPasswordAdmin(password);
                    Arrayadmin.add(admin);
                    JOptionPane.showMessageDialog(null, "REGISTRASI BERHASIL", "INFO", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Registrasi Gagal", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    
    log.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 try {
                    String username = textusernamereg.getText();
                    admin.getUsernameAdmin(username);
                    String password = passwordregis.getText();
                    admin.getPasswordAdmin();
                    Arrayadmin.add(admin);
                    JOptionPane.showMessageDialog(null, "SELAMAT DATANG " +admin.getNama(), "INFO", JOptionPane.INFORMATION_MESSAGE);
                    Dashboard menu = new Dashboard();
                    FrameRegLog.dispose();
                    kosong();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Registrasi Gagal", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
void kosong() {
        textidadmin.setText(null);
        textnamaadmin.setText(null);
        textusernamereg.setText(null);
        passwordregis.setText(null);
        textusernamelog.setText(null);
        passwordlog.setText(null);
    }
}