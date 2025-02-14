
package dia3;

public class cliente {
    String id;
    String nombre;
    String apellido;
    String correo;
    String telefono;
    
    public cliente(){}
    
    public cliente(String id, String nombre, String apellido, String correo, String telefono){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "cliente{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    
}
