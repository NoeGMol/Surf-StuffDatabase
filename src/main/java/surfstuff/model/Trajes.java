package surfstuff.model;

public class Trajes extends Stuff{
    int idTrajes;
    String tempProd;
    String matProd;
    String talleProd;
    String groProd;
    String tipCieProd;
    public Trajes(String nomProd, String marcaProd, String tipoProd, int precioProd, int idTrajes, String tempProd, String matProd, String groProd,
            String tipCieProd, String talleProd) {
        super(nomProd, marcaProd, tipoProd, precioProd);
        this.tempProd = tempProd;
        this.matProd = matProd;
        this.groProd = groProd;
        this.tipCieProd = tipCieProd;
        this.talleProd = talleProd;
        this.idTrajes = idTrajes;
    }
    public String getTempProd() {
        return tempProd;
    }
    public void setTempProd(String tempProd) {
        this.tempProd = tempProd;
    }
    public String getMatProd() {
        return matProd;
    }
    public void setMatProd(String matProd) {
        this.matProd = matProd;
    }
    public String getGroProd() {
        return groProd;
    }
    public void setGroProd(String groProd) {
        this.groProd = groProd;
    }
    public String getTipCieProd() {
        return tipCieProd;
    }
    public void setTipCieProd(String tipCieProd) {
        this.tipCieProd = tipCieProd;
    }
    public int getIdTrajes() {
        return idTrajes;
    }
    public void setIdTrajes(int idTrajes) {
        this.idTrajes = idTrajes;
    }
    public String getTalleProd() {
        return talleProd;
    }
    public void setTalleProd(String talleProd) {
        this.talleProd = talleProd;
    }
    @Override
    public String toString() {
        return "Trajes [idTrajes=" + idTrajes + ", tempProd=" + tempProd + ", matProd=" + matProd + ", talleProd="
                + talleProd + ", groProd=" + groProd + ", tipCieProd=" + tipCieProd + ", toString()=" + super.toString()
                + "]";
    }
    
    
}

