
package sistema_administrativo_armas_raquel_alonso;

public class ArmaCorta extends Arma {
    //Atributos
    protected boolean automatica;//si o no
    
    //constructores

    public ArmaCorta() {
    }


    public ArmaCorta(boolean automatica, Policia policia, int municiones, double alcanceMetros, String marca, int calibre, String estado) {
        super(policia, municiones, alcanceMetros, marca, calibre, estado);
        this.automatica = automatica;
    }
    
    //geters y setters
    //solo puse los de esta clase ya que los otros tienen sus respectivos
    //getters y setters

    public boolean isAutomatica() {
        return automatica;
    }
    

    public void setAutomatica(boolean automatica) {
        this.automatica = automatica;
    }
    
    
    
    //Metodos
    
     public boolean puedeDisparar200m() {
        return getAlcanceMetros() > 200;
    }

    @Override
    public String toString() {
        return "ArmaCorta [EsAutomatica=" + automatica + ", " + super.toString() + "]";
    }
            
            
}
