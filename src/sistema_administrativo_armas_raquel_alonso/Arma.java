
package sistema_administrativo_armas_raquel_alonso;

public abstract class Arma {
    
    //Atributos
    protected int municiones;
    protected double alcanceMetros;
    protected String marca;
    protected int calibre;
    protected String estado; //puede ser nueva, en mantenimineto y en uso
    
    //Constructores

    protected Arma() {
    }

    protected Arma(int municiones, double alcanceMetros, String marca, int calibre, String estado) {
        this.municiones = municiones;
        this.alcanceMetros = alcanceMetros;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }
    
    
}
