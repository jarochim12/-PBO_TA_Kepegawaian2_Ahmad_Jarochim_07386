package Model;

import Entity.AdminEntity;
import java.util.ArrayList;

/**
 *
 * @author Yoga Pratama
 */
public class AdminModel implements InterfacesModel {
    public ArrayList<AdminEntity> DataAdmin;
    
    public AdminModel(){
        DataAdmin = new ArrayList<>();
    }
    
    public ArrayList<AdminEntity> getDataAdmin(){
        return DataAdmin;
    }
    
    public void view(){
        
    }
    
    public void insert(Object x){
        DataAdmin.add((AdminEntity) x);
    }
    
    public void update(int index, Object x){
        DataAdmin.set(index, (AdminEntity) x);
    }
    
    public void delete(int index){
        DataAdmin.remove(index);
    }
    
}
