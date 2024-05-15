
package sistema_administrativo_armas_raquel_alonso;

public abstract class Policia {
    //Atributos protected solo para los hijos
    
    protected String nombre;
    protected String apellido;
    protected int legajo;
    
    //Constructores

    protected Policia() {
    }

    protected Policia(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }
    
    
}
