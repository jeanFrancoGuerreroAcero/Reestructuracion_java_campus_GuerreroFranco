
package dia3;


public class zona {
    int id;
    String nombreZona;
    int capacidad;
    String correo;
    int precioAdicional;
    
    public zona(int id, String nombreZona, int capacidad, String correo, int precioAdicional){
        this.id = id;
        this.nombreZona = nombreZona;
        this.capacidad = capacidad;
        this.correo = correo;
        this.precioAdicional = precioAdicional;
    }

    @Override
    public String toString() {
        return "zona{" + "id=" + id + ", nombreZona=" + nombreZona + ", capacidad=" + capacidad + ", correo=" + correo + ", precioAdicional=" + precioAdicional + '}';
    }
}
