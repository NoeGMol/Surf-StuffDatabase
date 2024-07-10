package surfstuff.model;

public class Stuff {
    String nomProd;
    String marcaProd;
    String tipoProd;
    int precioProd;

    public Stuff(String nomProd, String marcaProd, String tipoProd, int precioProd) {
        this.nomProd = nomProd;
        this.marcaProd = marcaProd;
        this.tipoProd = tipoProd;
        this.precioProd = precioProd;
    }
    public String getNomProd() {
        return nomProd;
    }
    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }
    public String getMarcaProd() {
        return marcaProd;
    }
    public void setMarcaProd(String marcaProd) {
        this.marcaProd = marcaProd;
    }
    public String getTipoProd() {
        return tipoProd;
    }
    public void setTipoProd(String tipoProd) {
        this.tipoProd = tipoProd;
    }
    public int getPrecioProd() {
        return precioProd;
    }
    public void setPrecioProd(int precioProd) {
        this.precioProd = precioProd;
    }
    @Override
    public String toString() {
        return "Stuff [nomProd=" + nomProd + ", marcaProd=" + marcaProd + ", tipoProd=" + tipoProd + ", precioProd="
                + precioProd + ", toString()=" + super.toString() + "]";
    }
    
}
