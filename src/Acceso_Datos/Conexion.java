package Acceso_Datos;
import UI.FrmFotografia;
import javax.swing.*;
public class Conexion {
    private String driver = "com.mysql.cj.jdbc.Driver";

    private String url = "jdbc:mysql://localhost:3306/fotografiabd";
    private String user = "Katherine";
    private String pass = "2005kathy";
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
