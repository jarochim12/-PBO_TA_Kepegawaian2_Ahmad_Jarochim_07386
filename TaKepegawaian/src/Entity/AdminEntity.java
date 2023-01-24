package Entity;

/**
 *
 * @author Yoga Pratama
 */
public class AdminEntity extends UserEntity{
    private String usernameAdmin;
    private String passwordAdmin;
    
    public AdminEntity(){
        
    }
    
    public AdminEntity(String id, String nama, String alamat,String usernameADM, String passwordADM){
        super(id, nama, alamat);
        this.usernameAdmin = usernameADM;
        this.passwordAdmin = passwordADM;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsernameADM() {
        return usernameAdmin;
    }

    public void setUsernameADM(String usernameADM) {
        this.usernameAdmin = usernameADM;
    }
    
    public String getPasswordAdmin() {
        return passwordAdmin;
    }

    public void setPasswordAdmin(String passwordADM) {
        this.passwordAdmin = passwordADM;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void getUsernameAdmin(String username) {
        throw new UnsupportedOperationException(); 
    }

    public void getPasswordPtgs(String password) {
        throw new UnsupportedOperationException();
    }
    
}
