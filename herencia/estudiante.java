
package herencia;

public class estudiante extends herencia{
    private int codigoEstudiante;
    
    public estudiante(String nombre, String apellido, int numero){
        super(nombre,apellido,numero);
        
        this.codigoEstudiante = codigoEstudiante;
    }
    
    
    public void mostrarEstudiante(){
        System.out.println("nombre estudiante :" + getNombre());
        System.out.println("apellido estudiante :" + getApellido());
        System.out.println("numero estudiantes :" + getNumero());
        System.out.println("codigoEstudiante :" + codigoEstudiante);
    }

    @Override
    public String toString() {
        return "estudiante{" + "codigoEstudiante=" + codigoEstudiante + '}';
    }
    
    
}
