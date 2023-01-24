package Controler;

import Model.AdminModel;
import Entity.AdminEntity;
import java.util.ArrayList;

/**
 *
 * @author Yoga Pratama
 */
public class AdminController {
    public AdminModel ADM = new AdminModel();
    
    public AdminController(){
        
    }
    
    public ArrayList<AdminEntity> view(){
        return ADM.getDataAdmin();
    }
    
    public void insert(AdminEntity admin){
        ADM.insert(admin);
    }
    
    public void update(int index, AdminEntity admin){
        ADM.update(index, admin);
    }
    
    public void delete(int index){
        ADM.delete(index);
    }
    
}
