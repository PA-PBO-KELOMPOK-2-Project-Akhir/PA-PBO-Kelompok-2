package Entitas;

/**
 *
 * @author Silva_Jen_Retno
 */
public class EntitasPenumpang {
    int ID_User;
    String Password;
    String Nama;

    public EntitasPenumpang(int ID_User, String Password, String Nama) {
        this.ID_User = ID_User;
        this.Password = Password;
        this.Nama = Nama;
    }

    public int getID_User() {
        return ID_User;
    }

    public void setID_User(int ID_User) {
        this.ID_User = ID_User;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    
    
}
