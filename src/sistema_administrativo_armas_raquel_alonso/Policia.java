
package sistema_administrativo_armas_raquel_alonso;

public class Policia {
    //Atributos protected solo para los hijos
    
    private String nombre;
    private String apellido;
    private int legajo;
    
    //Constructores

    protected Policia() {
    }

    protected Policia(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    
    @Override
    public String toString() {
        return "Policia [Nombre=" + nombre + ", Apellido=" + apellido + ", Legajo=" + legajo + "]";
    }
    
}
