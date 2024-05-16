
package sistema_administrativo_armas_raquel_alonso;

public class ArmaLarga extends Arma{
    //Atributos propios
    
    protected boolean selloRenar;
    protected String descripcion;//justificando su uso
    protected int nivel; //puede ser del 1 al 5

    //Constructores 

    public ArmaLarga() {
    }


    public ArmaLarga(boolean selloRenar, String descripcion, int nivel, Policia policia, int municiones, double alcanceMetros, String marca, int calibre, String estado) {
        super(policia, municiones, alcanceMetros, marca, calibre, estado);
        this.selloRenar = selloRenar;
        this.descripcion = descripcion;
        this.nivel = nivel;
    }
    
    //getters

    public boolean isSelloRenar() {
        return selloRenar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNivel() {
        return nivel;
    }
    
    //metodos
    
     public int compareTo(ArmaLarga otraArmaLarga) {
        return Integer.compare(this.nivel, otraArmaLarga.nivel);
    }
    @Override
    
     public String toString() {
        return "ArmaLarga [Tiene Sello RENAR= " + selloRenar + ", Descripcion= " + descripcion + ", Nivel= " + nivel + ", " + super.toString() + "]";
    }
}
