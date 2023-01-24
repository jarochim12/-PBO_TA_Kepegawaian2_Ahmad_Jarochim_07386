/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Entity.Pegawai;
import java.util.ArrayList;
import View.ObjectControler;
/**
 *
 * @author msi pc
 */
public class DataDiriModel {

  private ArrayList<Pegawai> datadiri;
    
    public DataDiriModel(){
        datadiri = new ArrayList<>();
    }
    
    public ArrayList<Pegawai> getDataPegawai(){
        return datadiri;
    }
    
    public void view(){
        
    }
    
    public void insert(Object x){
        datadiri.add((Pegawai) x);
    }
    
    public void update(int index, Object x){
       datadiri.set(index, (Pegawai) x);
    }
    
    public void delete(int index){
        datadiri.remove(index);
    }
    
    public void get_where(int index){
        datadiri.get(index);
    }
}
    

