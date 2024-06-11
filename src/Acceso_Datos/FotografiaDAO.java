package Acceso_Datos;

import java.sql.*;
import java.util.ArrayList;
import Entidades.Fotografia;
public class FotografiaDAO {
    PreparedStatement ps;
    ResultSet rs;
    Fotografia fot;
    Conexion cn = new Conexion();


    public Connection getConexion() throws ClassNotFoundException,
            SQLException {
        Class.forName(cn.getDriver());
        return DriverManager.getConnection(cn.getUrl(),cn.getUser(),cn.getPass());
    }
    public ArrayList<Fotografia> mostrar (){
        ArrayList<Fotografia> listFot = new ArrayList<>();
        try {
            ps = getConexion().prepareStatement("select * from fotografia");
            rs = ps.executeQuery();
            while (rs.next()){
                fot = new Fotografia(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
                listFot.add(fot);
            }
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return listFot;
    }
    public int guardar (Fotografia pFotografia){
        int result = 0;
        try{
            ps= getConexion().prepareStatement("INSERT INTO " + "fotografia(titulo,descripcion,ubicacion) values(?,?,?)");
            ps.setString(1,pFotografia.getTitulo());
            ps.setString(2,pFotografia.getDescripcion());
            ps.setString(3,pFotografia.getUbicacion());
            result = ps.executeUpdate();
        }catch (Exception ex){
            ex.printStackTrace();

        }
        return result;
    }
    public int eliminar (int pId){
        int result = 0;
        try{
            ps= getConexion().prepareStatement("DELETE FROM fotografia WHERE id = ?");
            ps.setInt(1,pId);
            result = ps.executeUpdate();
        }catch (Exception ex){
            ex.printStackTrace();

        }
        return result;
    }
}
