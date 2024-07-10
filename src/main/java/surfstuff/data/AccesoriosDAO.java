package surfstuff.data;

import static surfstuff.data.Conexion.getConexion;
import static surfstuff.data.Conexion.close;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import surfstuff.model.Accesorios;

public class AccesoriosDAO {
    private static final String SQL_SELECT ="SELECT * FROM accesorios";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM accesorios WHERE Id = ?";
    private static final String SQL_INSERT = "INSERT INTO acceosrios (nombre, tipo, marca, para_tablas, para_trajes, otros) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE INTO acceosrios (nombre=?, tipo=?, marca=?, para_tablas=?, para_trajes=?, otros=?)";
    private static final String SQL_DELETE = "DELETE FROM acceosrios WHERE id =?";

    public static List<Accesorios> seleccionar(){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Accesorios accesorio = null;
        List<Accesorios> accesorios = new ArrayList<>();

        try {
            conn = getConexion();
            ps = conn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();

            //Itero los resultados que me devuelva la base de datos en el ResulSet
            // Obtengo los abtributos de cada tabla y los seteo a los objetos Tablas
            // Guardo cada Tabla en el lsitado de tablas (ArrayList)
            while(rs.next()){
                int idAccesorios = rs.getInt("ID_accesorios");
                String nomProd = rs.getString("nombre");
                String tipoProd = rs.getString("tipo");
                String marcaProd = rs.getString("marca");
                String pTrajeProd = rs.getString("para_trajes");
                String pTablasProd = rs.getString("para_tablas");                
                String otroProd = rs.getString("otros");    
                int precioProd = rs.getInt("precio");         

                accesorio = new Accesorios(nomProd, marcaProd, tipoProd, precioProd, pTrajeProd, pTablasProd, otroProd, idAccesorios);

                accesorios.add(accesorio);
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
        return accesorios;
    }
}

