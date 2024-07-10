package surfstuff.model;

public class Tablas extends Stuff{
    int idTablas;
    String tamProd;
    String diseProd;
    String matProd;

    public Tablas(String nomProd, String marcaProd, String tipoProd, int precioProd, int idTablas, String tamProd, String diseProd, String matProd) {
        super(nomProd, marcaProd, tipoProd, precioProd);
        this.idTablas = idTablas;
        this.tamProd = tamProd;
        this.diseProd = diseProd;
        this.matProd = matProd;
    }

    public int getIdTablas() {
        return idTablas;
    }

    public void setIdTablas(int idTablas) {
        this.idTablas = idTablas;
    }

    public String getTamProd() {
        return tamProd;
    }

    public void setTamProd(String tamProd) {
        this.tamProd = tamProd;
    }

    public String getDiseProd() {
        return diseProd;
    }

    public void setDiseProd(String diseProd) {
        this.diseProd = diseProd;
    }
    public String getMatProd() {
        return matProd;
    }

    public void setMatProd(String matProd) {
        this.matProd = matProd;
    }

    @Override
    public String toString() {
        return "Tablas [idTablas=" + idTablas + ", tamProd=" + tamProd + ", diseProd=" + diseProd + ", matProd="
                + matProd + ", toString()=" + super.toString() + "]";
    }

}