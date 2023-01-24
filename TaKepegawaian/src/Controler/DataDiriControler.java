/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;
import Model.DataDiriModel;
import Entity.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import View.ObjectControler;
/**
 *
 * @author msi pc
 */
public class DataDiriControler {
    public DataDiriModel datadiri = new DataDiriModel();
    
    public DataDiriControler(){
        
    }
    
    public ArrayList<Pegawai> view(){
        return datadiri.getDataPegawai();
    }
    
    public void insert(String idPegawai, String namaPegawai, String alamatPegawai, String notelp){
        Pegawai pegawai = new Pegawai();
        pegawai.setId(idPegawai);
        pegawai.setNama(namaPegawai);
        pegawai.setAlamat(alamatPegawai);
        pegawai.setNoTelp(notelp);
        datadiri.insert(pegawai);
    }
    
    public void delete(int index){
       datadiri.delete(index);
    }
    
    public DefaultTableModel listpegawai(){
    DefaultTableModel dtmlistpegawai = new DefaultTableModel();
    Object[] kolom ={"ID", "Nama Pegawai", "Alamat", "No.Telp"};
    dtmlistpegawai.setColumnIdentifiers(kolom);
    int size = ObjectControler.pegawai.view().size();
    for (int i = 0; i < size; i++){
        Object [] pegawai =new Object[4];
        pegawai[0] = ObjectControler.pegawai.view().get(i).getId();
        pegawai[1] = ObjectControler.pegawai.view().get(i).getNama();
        pegawai[2] = ObjectControler.pegawai.view().get(i).getAlamat();
        pegawai[3] = ObjectControler.pegawai.view().get(i).getNoTelp();
        dtmlistpegawai.addRow(pegawai);
    }
    return dtmlistpegawai;
}
    
    public int cekPegawai(String idPegawai){
        int keterangan = -1;
        if(datadiri.getDataPegawai().size()>0){
            for(int i=0;i<datadiri.getDataPegawai().size();i++){
             if(idPegawai.equals(datadiri.getDataPegawai().get(i).getId())){
                 keterangan = i;
                 break;
             }else{
                 keterangan = -1;
             }
            }
        }
        return keterangan;
    }
    
    public Pegawai showDaftarPegawai(int index){
        return datadiri.getDataPegawai().get(index);
    }
}


