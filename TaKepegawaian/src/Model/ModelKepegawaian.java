package Model;



/**
 *
 * @author msi pc
 */
public class ModelKepegawaian {
    
    String nama, alamat, lahir, jabatan, telp;
        int id;

    public ModelKepegawaian(int id, String nama, String alamat, String lahir, String jabatan, String telp) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.lahir = lahir;
        this.jabatan = jabatan;
        this.telp = telp;
    }

    public ModelKepegawaian() {
        
    }


    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getLahir() {
        return lahir;
    }

    public String getJabatan() {
        return jabatan;
    }

    public String getTelp() {
        return telp;
    }

    public int getId() {
        return id;
    }

    
}

