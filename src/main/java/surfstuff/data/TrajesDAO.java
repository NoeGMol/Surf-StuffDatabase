package surfstuff.data;

import static surfstuff.data.Conexion.getConexion;
import static surfstuff.data.Conexion.close;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import surfstuff.model.Trajes;

public class TrajesDAO {
    private static final String SQL_SELECT ="SELECT * FROM trajes";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM trajes WHERE Id = ?";
    private static final String SQL_INSERT = "INSERT INTO trajes (marca, temporada, material, talle, grosor, tipo_de_cierre, nombre) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE INTO trajes (marca=?, temporada=?, material=?, talle=?, grosor=?, tipo_de_cierre=?, nombre=?)";
    private static final String SQL_DELETE = "DELETE FROM trajes WHERE id =?";

    public static List<Trajes> seleccionar(){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Trajes traje = null;
        List<Trajes> trajes = new ArrayList<>();

        try {
            conn = getConexion();
            ps = conn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();

            //Itero los resultados que me devuelva la base de datos en el ResulSet
            // Obtengo los abtributos de cada tabla y los seteo a los objetos Tablas
            // Guardo cada Tabla en el lsitado de tablas (ArrayList)
            while(rs.next()){
                int idTrajes = rs.getInt("ID_trajes");
                String marcaProd = rs.getString("marca");
                String tempProd = rs.getString("temporada");
                String matProd = rs.getString("material");
                String talleProd = rs.getString("talle");
                String groProd = rs.getString("grosor");
                String tipCieProd = rs.getString("tipo_de_cierre");
                String nomProd = rs.getString("nombre");
                int precioProd = rs.getInt("precio");

                traje = new Trajes(nomProd, marcaProd, groProd, precioProd, idTrajes, tempProd, matProd, groProd, tipCieProd, talleProd);

                trajes.add(traje);
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
        return trajes;
    }
}
