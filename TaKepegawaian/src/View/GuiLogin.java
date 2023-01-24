/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

//import java.lang.Exception;

/**
 *
 * @author msi pc
 */

class GuiLogin 
{
  
  public boolean login(String username, String password) throws Exception {
    // validasi username dan password
    if (username.equals("admin") && password.equals("admin")) {
        return true;
    }
    
    throw new Exception("kombinasi username dengan password salah.");
  } 
}
