package classroom;

public class Persona {

    final long cedula;
    String nombre;
    static int totalPersonas;
    static int sinCedula;
    
    static {
        totalPersonas = 0;
        sinCedula = 0;
    }
    
    Persona(){
    	this.cedula = sinCedula;
    	this.nombre = "";
    	sinCedula++;
    	totalPersonas++;
    }

    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    Persona(String nombre) {
    	this.cedula = sinCedula;
        this.nombre = "";
        sinCedula += 1;
        totalPersonas++;
    }
    
    long getCedula() {
        return cedula;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
