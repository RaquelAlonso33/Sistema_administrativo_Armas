
package sistema_administrativo_armas_raquel_alonso;

public abstract class Arma {
    
    //Atributos
    protected int municiones;
    protected double alcanceMetros;
    protected String marca;
    protected int calibre;
    protected String estado; //puede ser nueva, en mantenimineto y en uso
    protected Policia policia;
    //Constructores

    protected Arma() {
    }

    protected Arma(Policia policia,int municiones, double alcanceMetros, String marca, int calibre, String estado) {
        this.policia = policia;
        this.municiones = municiones;
        this.alcanceMetros = alcanceMetros;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }
    
    //Getters y setters

    protected int getMuniciones() {
        return municiones;
    }

    protected void setMuniciones(int municiones) {
        this.municiones = municiones;
    }

    protected double getAlcanceMetros() {
        return alcanceMetros;
    }

    protected void setAlcanceMetros(double alcanceMetros) {
        this.alcanceMetros = alcanceMetros;
    }

    protected String getMarca() {
        return marca;
    }

    protected void setMarca(String marca) {
        this.marca = marca;
    }

    protected int getCalibre() {
        return calibre;
    }

    protected void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    protected String getEstado() {
        return estado;
    }

    protected void setEstado(String estado) {
        this.estado = estado;
    }
    
    //Metodo
    
    public boolean enCondicion(){
        return "EN USO".equals(estado) && (calibre >= 9);
    };
    
    public String toString() {
        return "Arma [Policia=" + policia + ", Cantidad Municiones=" + municiones + ", Alcance=" + alcanceMetros +
                ", Marca=" + marca + ", Calibre=" + calibre + ", Estado=" + estado + "]";
    }
    
    
}
