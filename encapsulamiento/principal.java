
package encapsulamiento;

public class principal {
    public static void main(String[] args) {
        clase1 newclas = new clase1(12);
        
        System.out.println(newclas.getEdad());
        
        newclas.setEdad(10);
        
        System.out.println(newclas.getEdad());
    }
}
