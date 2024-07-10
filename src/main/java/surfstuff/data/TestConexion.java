package surfstuff.data;

public class TestConexion {

    public static void main(String[] args) {
        
        TablasDAO dao = new TablasDAO();

        System.out.println("A continuacion datos de tablas: " + dao.seleccionar());

        TrajesDAO dao2 = new TrajesDAO();

        System.out.println("A continuacion datos de trajes: " + dao2.seleccionar());

        AccesoriosDAO dao3 = new AccesoriosDAO();

        System.out.println("A continuacion datos de Accesorios: " + dao3.seleccionar());
    }

}
