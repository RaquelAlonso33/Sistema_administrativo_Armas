
package sistema_administrativo_armas_raquel_alonso;

public class Sistema_administrativo_armas_Raquel_Alonso {
  
    public static void main(String[] args) {
        //Creamos los objetos policia y las respecgtivas armas
        Policia policia1 = new Policia("Juan", "Perez", 1234);
        Policia policia2 = new Policia("Maria", "Paz", 5678);

        ArmaCorta armaCorta1 = new ArmaCorta(true,policia1, 15, 250, "Glock", 9, "EN USO");
        ArmaCorta armaCorta2 = new ArmaCorta(false,policia2, 10, 180, "Beretta", 8, "EN MANTENIMIENTO");

        ArmaLarga armaLarga1 = new ArmaLarga(true,"Uso táctico",4,policia1, 30, 800, "Remington", 12, "EN USO");
        ArmaLarga armaLarga2 = new ArmaLarga(true,"Uso policial",3,policia2, 25, 600, "ak47", 7, "EN USO");

        // Mostramos la informacion de las armas
        System.out.println(armaCorta1);
        System.out.println(armaCorta2);
        System.out.println(armaLarga1);
        System.out.println(armaLarga2);

        // Verificar si esta en condicines de eser usada
        System.out.println("Arma corta 1 en condiciones: " + armaCorta1.enCondicion());
        System.out.println("Arma larga 1 en condiciones: " + armaLarga1.enCondicion());

        // Comparar armas largas
        System.out.println("Comparación de armas largas: " + armaLarga1.compareTo(armaLarga2));

        // Verificando el alcance de lasarmas cortas
        System.out.println("Arma corta 1 puede disparar a más de 200m: " + armaCorta1.puedeDisparar200m());
        System.out.println("Arma corta 2 puede disparar a más de 200m: " + armaCorta2.puedeDisparar200m());
    
        
    }
    
}
