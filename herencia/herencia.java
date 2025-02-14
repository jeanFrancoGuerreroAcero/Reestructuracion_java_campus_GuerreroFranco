package herencia;

public class herencia {
    private String nombre;
    private String apellido;
    private int numero;
    
    public herencia(String nombre, String apellido, int numero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "herencia{" + "nombre=" + nombre + ", apellido=" + apellido + ", numero=" + numero + '}';
    }
    
    
}
