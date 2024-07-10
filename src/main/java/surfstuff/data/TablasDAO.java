package surfstuff.data;

import static surfstuff.data.Conexion.getConexion;
import static surfstuff.data.Conexion.close;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import surfstuff.model.Tablas;

public class TablasDAO {

    private static final String SQL_SELECT ="SELECT * FROM tablas";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM tablas WHERE Id = ?";
    private static final String SQL_INSERT = "INSERT INTO tablas (nombre, tipo, marca, material, tamanio, disenio, Precio) VALUES (?, ?, ?, ?, ?, ?,?)";
    private static final String SQL_UPDATE = "UPDATE INTO tablas (nombre=?, tipo=?, marca=?, material=?, tamanio=?, disenio=?, Precio=?)";
    private static final String SQL_DELETE = "DELETE FROM tablas WHERE id =?";

    public static List<Tablas> seleccionar(){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Tablas tabla = null;
        List <Tablas> tablas = new ArrayList<>();

        try {
            conn = getConexion();
            ps = conn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();

            //Itero los resultados que me devuelva la base de datos en el ResulSet
            // Obtengo los abtributos de cada tabla y los seteo a los objetos Tablas
            // Guardo cada Tabla en el lsitado de tablas (ArrayList)
            while(rs.next()){
                int idTablas = rs.getInt("ID_tablas");
                String nomProd = rs.getString("nombre");
                String tipoProd = rs.getString("tipo");
                String marcaProd = rs.getString("marca");
                String matProd = rs.getString("material");
                String tamProd = rs.getString("tamanio");
                String diseProd = rs.getString("disenio");
                int precioProd = rs.getInt("Precio");

                tabla = new Tablas(nomProd, marcaProd, tipoProd, precioProd, idTablas, tamProd, diseProd, matProd);

                tablas.add(tabla);
            }

        } catch (SQLException e){
            e.printStackTrace(System.out);            
        } finally {

        }try {
            close(rs);
            close(ps);
            close(conn);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return tablas;
    }


    /*public static List<Tablas> seleccionarPorId(){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Tablas tablas = null;
        List<Tablas> tabla = new ArrayList<>();

        try {
            conn = getConexion();
            ps = conn.prepareStatement(SQL_SELECT_BY_ID);
            rs = ps.executeQuery();

            //Itero los resultados que me devuelva la base de datos en el ResulSet
            // Obtengo los abtributos de cada tabla y los seteo a los objetos Tablas
            // Guardo cada Tabla en el lsitado de tablas (ArrayList)
            while(rs.next()){
                int id = rs.getInt("id");
                String nomProd = rs.getString("nombre");
                String tipProd = rs.getString("tipo");
                String marProd = rs.getString("marca");
                String matProd = rs.getString("material");
                String tamProd = rs.getString("tamanio");
                String disProd = rs.getString("disenio");

                tablas = new Tablas();

                //tablas.add(tabla);
            }

        } catch (SQLException e){
            e.printStackTrace(System.out);            
        } finally {

        }try {
            close(rs);
            close(ps);
            close(conn);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        //return tablas;
    } */
}
