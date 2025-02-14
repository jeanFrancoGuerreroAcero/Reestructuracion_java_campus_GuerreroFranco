
package dia3;


public class Ticket {
    int id;
    int idCliente;
    int idConcierto;
    String zona;
    int precioFinal;
    String fechaCompra;
    
    public Ticket(){}
    
    public Ticket(int id, int idCliente, int idConcierto, String zona, int precioFinal, String fechaCompra){
        this.id = id;
        this.idCliente = idCliente;
        this.idConcierto = idConcierto;
        this.zona = zona;
        this.precioFinal = precioFinal;
        this.fechaCompra = fechaCompra;
    }

    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ", idCliente=" + idCliente + ", idConcierto=" + idConcierto + ", zona=" + zona + ", precioFinal=" + precioFinal + ", fechaCompra=" + fechaCompra + '}';
    }
    
}
