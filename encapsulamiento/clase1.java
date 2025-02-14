
package encapsulamiento;

public class clase1 {
    private int edad;

    public clase1(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "clase1{" + "edad=" + edad + '}';
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
