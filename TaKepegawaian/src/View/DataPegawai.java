/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import Entity.*;
import Controler.*;
import static View.ObjectControler.pegawai;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 *
 * @author msi pc
 */
public class DataPegawai {
  public static DataDiriControler datadiricon = new DataDiriControler();
    public static Pegawai pegawaii = new Pegawai();
    public static ArrayList<Pegawai> Arraypegawai = new ArrayList<Pegawai>();
    JFrame FrameRegLog = new JFrame();
    JTable tabelPegawai = new JTable();
    JScrollPane scrolPegawai = new JScrollPane(tabelPegawai);
    JLabel menu, top;
    JTextField textidpegawai, textnamapegawai, textalamatpegawai, textnotelp;
    JLabel labelidpegawai, labelnamapegawai, labelalamatpegawai, labelnotelp;
    JButton tambah, hapus, kembali;
    int index;
    
public DataPegawai(){
    FrameRegLog.setSize(800, 700);
    FrameRegLog.setLayout(null);
    FrameRegLog.getContentPane().setBackground(Color.GREEN);
    top = new JLabel("*****PT.UBS*****");
    top.setBounds(150, 10, 600, 50);
    top.setFont(new Font("Times New Roman", Font.BOLD, 40));
    FrameRegLog.add(top);
    menu = new JLabel("======DATA PEGAWAI======");
    menu.setBounds(155, 60, 600, 50);
    menu.setFont(new Font("Times New Roman", Font.BOLD, 30));
    FrameRegLog.add(menu);
     
    scrolPegawai.setBounds(100,350,600,270);
    tabelPegawai.setModel(datadiricon.listpegawai());
    FrameRegLog.add(scrolPegawai);
    
    labelidpegawai = new JLabel("ID");
    labelidpegawai.setBounds(155, 120, 100, 30);
    FrameRegLog.add(labelidpegawai);
    textidpegawai = new JTextField();
    textidpegawai.setBounds(230, 120, 400, 30);
    FrameRegLog.add(textidpegawai);
    
    labelnamapegawai = new JLabel("NAMA");
    labelnamapegawai.setBounds(155, 160, 100, 30);
    FrameRegLog.add(labelnamapegawai);
    textnamapegawai = new JTextField();
    textnamapegawai.setBounds(230, 160, 400, 30);
    FrameRegLog.add(textnamapegawai);
    
    labelalamatpegawai = new JLabel("ALAMAT");
    labelalamatpegawai.setBounds(155, 200, 100, 30);
    FrameRegLog.add(labelalamatpegawai);
    textalamatpegawai = new JTextField();
    textalamatpegawai.setBounds(230, 200, 400, 30);
    FrameRegLog.add(textalamatpegawai);
    
    labelnotelp = new JLabel("NO.TELP");
    labelnotelp.setBounds(155, 240, 100, 30);
    FrameRegLog.add(labelnotelp);
    textnotelp = new JTextField();
    textnotelp.setBounds(230, 240, 400, 30);
    FrameRegLog.add(textnotelp);
    
    tambah = new JButton("TAMBAH");
    tambah.setBounds(230, 300, 100, 30);
    tambah.setBackground(Color.WHITE);
    FrameRegLog.add(tambah);
    
    hapus = new JButton("HAPUS");
    hapus.setBounds(350, 300, 100, 30);
    hapus.setBackground(Color.WHITE);
    FrameRegLog.add(hapus);
    
    kembali = new JButton("KEMBALI");
    kembali.setBounds(470, 300, 100, 30);
    kembali.setBackground(Color.WHITE);
    FrameRegLog.add(kembali);
    
    FrameRegLog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    FrameRegLog.setVisible(true);
    FrameRegLog.setLocationRelativeTo(null);
    
    tabelPegawai.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelPegawai.getSelectedRow();
                index=i;
                textidpegawai.setText(ObjectControler.pegawai.listpegawai().getValueAt(i, 0).toString());
                textnamapegawai.setText(ObjectControler.pegawai.listpegawai().getValueAt(i, 1).toString());
                textalamatpegawai.setText(ObjectControler.pegawai.listpegawai().getValueAt(i, 2).toString());
                textnotelp.setText(ObjectControler.pegawai.listpegawai().getValueAt(i, 3).toString()); 
            }            
        });
        
    tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                   try{
                    String idpegawai = textidpegawai.getText();
                    String namapegawai =  textnamapegawai.getText();
                    String alamatpegawai = textalamatpegawai.getText();
                    String notelp = textnotelp.getText();
                    ObjectControler.pegawai.insert(idpegawai, namapegawai, alamatpegawai, notelp);
                    JOptionPane.showMessageDialog(null,"Tambah Pegawai Berhasil","INFO", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                    Arraypegawai.add(pegawaii);
                    tabelPegawai.setModel(ObjectControler.pegawai.listpegawai());
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Fomat penulisan salah","INFO", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });   
    
    hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{                 
                    ObjectControler.pegawai.delete(index);
                    JOptionPane.showMessageDialog(null,"Pegawai Berhasil Dihapus","INFO", JOptionPane.INFORMATION_MESSAGE);
                    tabelPegawai.setModel(ObjectControler.pegawai.listpegawai());
                    kosong();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Fomat penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
   
    kembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dashboard menu = new Dashboard();
                FrameRegLog.dispose();
            }
        });
    }
void kosong() {
        textidpegawai.setText(null);
        textnamapegawai.setText(null);
        textalamatpegawai.setText(null);
        textnotelp.setText(null);
    }
}  

