
package work;

public class estudiantes {
    String id;
    String nombre;
    String apellido;
    String cedula;
    String estado;
    String ruta;
    String trainer;
    String nota;
    
    
    public estudiantes(String id, String nombre, String apellido, String cedula, String estado, String ruta, String trainer, String nota){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.estado = estado;
        this.ruta = ruta;
        this.trainer = trainer;
        this.nota = nota;
    }
    
    public String getuser(){
        return nota;
    }
    
    public void setu(String nombre){
        this.nota = nombre;
    }

    @Override
    public String toString() {
        return "estudiantes{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", estado=" + estado + ", ruta=" + ruta + ", trainer=" + trainer + ", nota=" + nota + '}';
    }

}
