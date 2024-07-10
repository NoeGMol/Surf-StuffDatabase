package surfstuff.model;

public class Accesorios extends Stuff{
    String pTrajProd;
    String pTablaProd;
    String otroProd;
    int idAccesorios;

    public Accesorios(String nomProd, String marcaProd, String tipoProd, int precioProd, String pTrajProd, String pTablaProd,
            String otroProd, int idAccesorios) {
        super(nomProd, marcaProd, tipoProd, precioProd);
        this.pTrajProd = pTrajProd;
        this.pTablaProd = pTablaProd;
        this.otroProd = otroProd;
        this.idAccesorios = idAccesorios;
    }
    public String getpTrajProd() {
        return pTrajProd;
    }
    public void setpTrajProd(String pTrajProd) {
        this.pTrajProd = pTrajProd;
    }
    public String getpTablaProd() {
        return pTablaProd;
    }
    public void setpTablaProd(String pTablaProd) {
        this.pTablaProd = pTablaProd;
    }
    public String getOtroProd() {
        return otroProd;
    }
    public void setOtroProd(String otroProd) {
        this.otroProd = otroProd;
    }
    public int getIdAccesorios() {
        return idAccesorios;
    }
    public void setIdAccesorios(int idAccesorios) {
        this.idAccesorios = idAccesorios;
    }
    @Override
    public String toString() {
        return "Accesorios [pTrajProd=" + pTrajProd + ", pTablaProd=" + pTablaProd + ", otroProd=" + otroProd
                + ", idAccesorios=" + idAccesorios + ", toString()=" + super.toString() + "]";
    }
}