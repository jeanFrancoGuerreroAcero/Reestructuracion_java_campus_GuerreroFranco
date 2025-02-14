
package dia3;

import java.util.ArrayList;
import java.util.Scanner;

public class Dia3 {
    public static void main(String[] args) {
        
        cliente cliente1 = new cliente("1" , "franco" , "guerrero" , "franco@gmail.com" , "31221212");
        cliente cliente2 = new cliente("2" , "andres" , "martinez" , "andres@gmail.com" , "32222322");
        cliente cliente3 = new cliente("3" , "maria" , "acero" , "maria@gmail.com" , "322214413");
        cliente cliente4 = new cliente("4" , "eduardo" , "ortega" , "eduardo@gamil.com" , "34445567");        
        
        ArrayList<cliente> listaClientes = new ArrayList<>();
        
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        listaClientes.add(cliente4);
        
        concierto concierto1 = new concierto(1 , "estrellas" , "juancho rois" , "10-12-2025", "tibu" , 10000);
        concierto concierto2 = new concierto(2 , "Rock fest" , "natanael cano" , "10-08-2025" , "cucuta" , 40000);
        concierto concierto3 = new concierto(3 , "trap fest" , "anuel" , "10-03-2025" , "zalasar" , 80000);
        concierto concierto4 = new concierto(4 , "tumbados fest" , "natanael cano" , "10-05-2025" , "bochalema" , 60000);
        
        ArrayList<concierto> listaConcierto = new ArrayList<>();
        
        listaConcierto.add(concierto1);
        listaConcierto.add(concierto2);
        listaConcierto.add(concierto3);
        listaConcierto.add(concierto4);
        
        zona zona1 = new zona(1 , "familiar" , 3000 , "familiar@gmail.com" , 200);
        zona zona2 = new zona(2 , "general" , 8000 , "general@gmail.com" , 100);
        zona zona3 = new zona(3 , "Vip" , 1000 , "vip@gmail.com" , 1000);
        zona zona4 = new zona(4 , "juvenil" , 4000 , "juvenil@gmail.com" , 300);
        
        ArrayList<zona> listaZona = new ArrayList<>();
        
        listaZona.add(zona1);
        listaZona.add(zona2);
        listaZona.add(zona3);
        listaZona.add(zona4);
        
        Ticket Ticket1 = new Ticket(1 , 1 , 1 , "familiar" , 13000 , "13-02-2025");
        Ticket Ticket2 = new Ticket(2 , 2 , 2 , "general" , 40200 , "13-02-2025");
        Ticket Ticket3 = new Ticket(3 , 3 , 3 , "vip" , 81000 , "13-02-2025");
        Ticket Ticket4 = new Ticket(4 , 4 , 4 , "juvenil" , 60300 , "13-02-2025");
                
        ArrayList<Ticket> listaTicket = new ArrayList<>();
        
        listaTicket.add(Ticket1);
        listaTicket.add(Ticket2);
        listaTicket.add(Ticket3);
        listaTicket.add(Ticket4);
        
        ArrayList<Object> ticketsCarrito1 = new ArrayList<>();
        ArrayList<Object> ticketsCarrito2 = new ArrayList<>();
        ArrayList<Object> ticketsCarrito3 = new ArrayList<>();
        ArrayList<Object> ticketsCarrito4 = new ArrayList<>();
        
        System.out.println("---------------");
        System.out.println("NOTAS VIBRANTES");
        System.out.println("---------------");
        System.out.println("");
        
        boolean hh = true;
        while (hh == true) {
            System.out.println("1. Ver conciertos disponibles");
            System.out.println("2. Registrar cliente");
            System.out.println("3. Comprar ticket");
            System.out.println("4. Ver tickets por cliente");
            System.out.println("5. Cancelar ticket");
            System.out.println("");
            Scanner sc = new Scanner(System.in);

            int opcion = sc.nextInt();
            
            if(opcion == 1){
                System.out.println("----------------------");
                System.out.println("CONCIERTOS DISPONIBLES");
                System.out.println("----------------------");
                System.out.println("");
                
                for (int i = 0; i<listaConcierto.size(); i ++){
                    System.out.println(listaConcierto.get(i).id + " " + listaConcierto.get(i).nombre + " " + listaConcierto.get(i).artista + " " + listaConcierto.get(i).fecha + " " + listaConcierto.get(i).lugar + " " + listaConcierto.get(i).precioBase);
                }
                System.out.println("");
            }
            else if(opcion == 2){
                System.out.println("------------------");
                System.out.println("REGISTRAR CLIENTES");
                System.out.println("------------------");
                System.out.println("");
                
                System.out.println("Ingresa el id del cliente");
                String newId = sc.nextLine();
                
                sc.nextLine();
                
                System.out.println("Ingresa el nombre del cliente");
                String newNombre = sc.nextLine();
                
                System.out.println("Ingresa el apellido del cliente");
                String newApellido = sc.nextLine();
                
                System.out.println("Ingresa el correo del cliente");
                String newCorreo = sc.nextLine();
                
                System.out.println("Ingresa el telefono del cliente");
                String newCliente = sc.nextLine();
                
                cliente cliente5 = new cliente(newId, newNombre, newApellido, newCorreo, newCliente);
            }
            else if(opcion == 3){
                System.out.println("--------------");
                System.out.println("COMPRAR TICKET");
                System.out.println("--------------");
                System.out.println("");
                
                System.out.println("Que cliente eres");
                for(int i = 0; i<listaClientes.size(); i ++){
                    System.out.println(listaClientes.get(i).id + " "  + listaClientes.get(i).nombre + " " + listaClientes.get(i).apellido);
                }
                
                int queCliente = sc.nextInt();
                
                //cliente 1
                if (queCliente == 1){
                    for (int i = 0; i<listaTicket.size(); i++){
                        System.out.println(listaTicket.get(i).id + " " + listaTicket.get(i).idCliente + " " + listaTicket.get(i).idConcierto + " " + listaTicket.get(i).zona + " " + listaTicket.get(i).precioFinal + " " + listaTicket.get(i).fechaCompra);
                    }
                    
                    System.out.println("Que ticket quieres comprar");

                    int comprarTicket = sc.nextInt();

                    if (comprarTicket == 1){
                        System.out.println("Esta es la informacion de tu ticket");
                        System.out.println(listaTicket.get(0).id + " " + listaTicket.get(0).idCliente + " " + listaTicket.get(0).idConcierto + " " + listaTicket.get(0).zona + listaTicket.get(0).precioFinal + " " + listaTicket.get(0).fechaCompra);

                        ticketsCarrito1.add(Ticket1);
                    }
                    else if(comprarTicket == 2){
                        System.out.println("Esta es la informacion de tu ticket");
                        System.out.println(listaTicket.get(1).id + " " + listaTicket.get(1).idCliente + " " + listaTicket.get(1).idConcierto + " " + listaTicket.get(1).zona + listaTicket.get(1).precioFinal + " " + listaTicket.get(1).fechaCompra);

                        ticketsCarrito1.add(Ticket2);
                    }
                    else if(comprarTicket == 3){
                        System.out.println("Esta es la informacion de tu ticket");
                        System.out.println(listaTicket.get(2).id + " " + listaTicket.get(2).idCliente + " " + listaTicket.get(2).idConcierto + " " + listaTicket.get(2).zona + listaTicket.get(2).precioFinal + " " + listaTicket.get(2).fechaCompra);

                        ticketsCarrito1.add(Ticket3);
                    }
                    else if(comprarTicket == 4){
                        System.out.println("Esta es la informacion de tu ticket");
                        System.out.println(listaTicket.get(3).id + " " + listaTicket.get(3).idCliente + " " + listaTicket.get(3).idConcierto + " " + listaTicket.get(3).zona + listaTicket.get(3).precioFinal + " " + listaTicket.get(3).fechaCompra);

                        ticketsCarrito1.add(Ticket4);
                    }
                    else {
                        System.out.println("Ingresa un ticket de la lista");
                    }
                }//cliente 2
                else if(queCliente == 2){
                    for (int i = 0; i<listaTicket.size(); i++){
                        System.out.println(listaTicket.get(i).id + " " + listaTicket.get(i).idCliente + " " + listaTicket.get(i).idConcierto + " " + listaTicket.get(i).zona + " " + listaTicket.get(i).precioFinal + " " + listaTicket.get(i).fechaCompra);
                    }

                    int comprarTicket = sc.nextInt();

                    if (comprarTicket == 1){
                        System.out.println("Esta es la informacion de tu ticket");
                        System.out.println(listaTicket.get(0).id + " " + listaTicket.get(0).idCliente + " " + listaTicket.get(0).idConcierto + " " + listaTicket.get(0).zona + listaTicket.get(0).precioFinal + " " + listaTicket.get(0).fechaCompra);

                        ticketsCarrito2.add(Ticket1);
                    }
                    else if(comprarTicket == 2){
                        System.out.println("Esta es la informacion de tu ticket");
                        System.out.println(listaTicket.get(1).id + " " + listaTicket.get(1).idCliente + " " + listaTicket.get(1).idConcierto + " " + listaTicket.get(1).zona + listaTicket.get(1).precioFinal + " " + listaTicket.get(1).fechaCompra);

                        ticketsCarrito2.add(Ticket2);
                    }
                    else if(comprarTicket == 3){
                        System.out.println("Esta es la informacion de tu ticket");
                        System.out.println(listaTicket.get(2).id + " " + listaTicket.get(2).idCliente + " " + listaTicket.get(2).idConcierto + " " + listaTicket.get(2).zona + listaTicket.get(2).precioFinal + " " + listaTicket.get(2).fechaCompra);

                        ticketsCarrito2.add(Ticket3);
                    }
                    else if(comprarTicket == 4){
                        System.out.println("Esta es la informacion de tu ticket");
                        System.out.println(listaTicket.get(3).id + " " + listaTicket.get(3).idCliente + " " + listaTicket.get(3).idConcierto + " " + listaTicket.get(3).zona + listaTicket.get(3).precioFinal + " " + listaTicket.get(3).fechaCompra);

                        ticketsCarrito2.add(Ticket4);
                    }
                    else {
                        System.out.println("Ingresa un ticket de la lista");
                    }
                }
                else if(queCliente == 3){
                    for (int i = 0; i<listaTicket.size(); i++){
                        System.out.println(listaTicket.get(i).id + " " + listaTicket.get(i).idCliente + " " + listaTicket.get(i).idConcierto + " " + listaTicket.get(i).zona + " " + listaTicket.get(i).precioFinal + " " + listaTicket.get(i).fechaCompra);
                    }

                    int comprarTicket = sc.nextInt();

                    if (comprarTicket == 1){
                        System.out.println("Esta es la informacion de tu ticket");
                        System.out.println(listaTicket.get(0).id + " " + listaTicket.get(0).idCliente + " " + listaTicket.get(0).idConcierto + " " + listaTicket.get(0).zona + listaTicket.get(0).precioFinal + " " + listaTicket.get(0).fechaCompra);

                        ticketsCarrito3.add(Ticket1);
                    }
                    else if(comprarTicket == 2){
                        System.out.println("Esta es la informacion de tu ticket");
                        System.out.println(listaTicket.get(1).id + " " + listaTicket.get(1).idCliente + " " + listaTicket.get(1).idConcierto + " " + listaTicket.get(1).zona + listaTicket.get(1).precioFinal + " " + listaTicket.get(1).fechaCompra);

                        ticketsCarrito3.add(Ticket2);
                    }
                    else if(comprarTicket == 3){
                        System.out.println("Esta es la informacion de tu ticket");
                        System.out.println(listaTicket.get(2).id + " " + listaTicket.get(2).idCliente + " " + listaTicket.get(2).idConcierto + " " + listaTicket.get(2).zona + listaTicket.get(2).precioFinal + " " + listaTicket.get(2).fechaCompra);

                        ticketsCarrito3.add(Ticket3);
                    }
                    else if(comprarTicket == 4){
                        System.out.println("Esta es la informacion de tu ticket");
                        System.out.println(listaTicket.get(3).id + " " + listaTicket.get(3).idCliente + " " + listaTicket.get(3).idConcierto + " " + listaTicket.get(3).zona + listaTicket.get(3).precioFinal + " " + listaTicket.get(3).fechaCompra);

                        ticketsCarrito3.add(Ticket4);
                    }
                    else {
                        System.out.println("Ingresa un ticket de la lista");
                    }
                }//cliente 4
                else if(queCliente == 4){
                    for (int i = 0; i<listaTicket.size(); i++){
                        System.out.println(listaTicket.get(i).id + " " + listaTicket.get(i).idCliente + " " + listaTicket.get(i).idConcierto + " " + listaTicket.get(i).zona + " " + listaTicket.get(i).precioFinal + " " + listaTicket.get(i).fechaCompra);
                    }

                    int comprarTicket = sc.nextInt();

                    if (comprarTicket == 1){
                        System.out.println("Esta es la informacion de tu ticket");
                        System.out.println(listaTicket.get(0).id + " " + listaTicket.get(0).idCliente + " " + listaTicket.get(0).idConcierto + " " + listaTicket.get(0).zona + listaTicket.get(0).precioFinal + " " + listaTicket.get(0).fechaCompra);

                        ticketsCarrito4.add(Ticket1);
                    }
                    else if(comprarTicket == 2){
                        System.out.println("Esta es la informacion de tu ticket");
                        System.out.println(listaTicket.get(1).id + " " + listaTicket.get(1).idCliente + " " + listaTicket.get(1).idConcierto + " " + listaTicket.get(1).zona + listaTicket.get(1).precioFinal + " " + listaTicket.get(1).fechaCompra);

                        ticketsCarrito4.add(Ticket2);
                    }
                    else if(comprarTicket == 3){
                        System.out.println("Esta es la informacion de tu ticket");
                        System.out.println(listaTicket.get(2).id + " " + listaTicket.get(2).idCliente + " " + listaTicket.get(2).idConcierto + " " + listaTicket.get(2).zona + listaTicket.get(2).precioFinal + " " + listaTicket.get(2).fechaCompra);

                        ticketsCarrito4.add(Ticket3);
                    }
                    else if(comprarTicket == 4){
                        System.out.println("Esta es la informacion de tu ticket");
                        System.out.println(listaTicket.get(3).id + " " + listaTicket.get(3).idCliente + " " + listaTicket.get(3).idConcierto + " " + listaTicket.get(3).zona + listaTicket.get(3).precioFinal + " " + listaTicket.get(3).fechaCompra);

                        ticketsCarrito4.add(Ticket4);
                    }
                    else {
                        System.out.println("Ingresa un ticket de la lista");
                    }
                }
                else{
                    System.out.println("Ingresa una opcion que este dentro del menu");
                }
            }
            else if(opcion == 4){
                System.out.println("-----------------------");
                System.out.println("VER TICKETS POR CLIENTE");
                System.out.println("-----------------------");
                System.out.println("");
                
                System.out.println("A que cliente deseas ver los tickets que tiene");
                for (int i = 0; i<listaClientes.size();i ++){
                    System.out.println(listaClientes.get(i).id + " " + listaClientes.get(i).nombre + " " + listaClientes.get(i).apellido);
                }
                
                int tickectsTiene = sc.nextInt();
                
                if (tickectsTiene == 1){//ticket cliente 1
                    for (int i = 0; i<ticketsCarrito1.size(); i++){
                        System.out.println(ticketsCarrito1.get(i));
                    }
                }
                else if(tickectsTiene == 2){//ticket cliente 2
                    for (int i = 0; i<ticketsCarrito1.size(); i++){
                        System.out.println(ticketsCarrito2.get(i));
                    }
                }
                else if(tickectsTiene == 3){//ticket cliente 3
                    for (int i = 0; i<ticketsCarrito1.size(); i++){
                        System.out.println(ticketsCarrito3.get(i));
                    }
                }
                else if(tickectsTiene == 4){//ticket cliente 4
                    for (int i = 0; i<ticketsCarrito1.size(); i++){
                        System.out.println(ticketsCarrito4.get(i));
                    }
                }
                else{
                    System.out.println("Ingresa un cliente dentro del menu");
                }
            }
            else if(opcion == 5){
                System.out.println("----------------");
                System.out.println("CANCELAR TICKETS");
                System.out.println("----------------");
                System.out.println("");
                
                System.out.println("Que cliente eres :");
                
                for(int i = 0 ; i<listaClientes.size();i++){
                   System.out.println(listaClientes.get(i).id + " "  + listaClientes.get(i).nombre + " " + listaClientes.get(i).apellido);
                }
                
                int client = sc.nextInt();
                
                ArrayList<Object> ticketQuitar = new ArrayList<>();
                
                if(client == 1){
                    ticketQuitar = ticketsCarrito1;
                    System.out.println("Los tickets que tienes son:");
                    
                    for(int i = 0; i<ticketQuitar.size();i++){
                        System.out.println(ticketQuitar);
                    }
                    System.out.println("Cual ticket quieres cancelar");
                    
                    int elimiTicket = sc.nextInt();
                    
                    if (elimiTicket > 0 && elimiTicket <= ticketQuitar.size()) {
                        ticketQuitar.remove(elimiTicket - 1);
                        System.out.println("El ticket ha sido cancelado correctamente.");
                    } else {
                        System.out.println("No tienes este ticket");
                    }
                }
                else if(client == 2){
                    ticketQuitar = ticketsCarrito2;
                    
                    System.out.println("Los tickets que tienes son:");
                    
                    for(int i = 0; i<ticketQuitar.size();i++){
                        System.out.println(ticketQuitar);
                    }
                    
                    System.out.println("Cual ticket quieres cancelar");
                    
                    int elimiTicket = sc.nextInt();
                    
                    if (elimiTicket > 0 && elimiTicket <= ticketQuitar.size()) {
                        ticketQuitar.remove(elimiTicket - 1);
                        System.out.println("El ticket ha sido cancelado correctamente.");
                    } else {
                        System.out.println("No tienes este ticket");
                    }
                }
                else if(client == 3){
                    ticketQuitar = ticketsCarrito3;
                    
                    System.out.println("Los tickets que tienes son:");
                    
                    for(int i = 0; i<ticketQuitar.size();i++){
                        System.out.println(ticketQuitar);
                    }
                    
                    System.out.println("Cual ticket quieres cancelar");
                    
                    int elimiTicket = sc.nextInt();
                    
                    if (elimiTicket > 0 && elimiTicket <= ticketQuitar.size()) {
                        ticketQuitar.remove(elimiTicket - 1);
                        System.out.println("El ticket ha sido cancelado correctamente.");
                    } else {
                        System.out.println("No tienes este ticket");
                    }
                }
                else if(client == 4){
                    ticketQuitar = ticketsCarrito4;
                    
                    System.out.println("Los tickets que tienes son:");
                    
                    for(int i = 0; i<ticketQuitar.size();i++){
                        System.out.println(ticketQuitar);
                    }
                    
                    System.out.println("Cual ticket quieres cancelar");
                    
                    int elimiTicket = sc.nextInt();
                    
                    if (elimiTicket > 0 && elimiTicket <= ticketQuitar.size()) {
                        ticketQuitar.remove(elimiTicket - 1);
                        System.out.println("El ticket ha sido cancelado correctamente.");
                    } else {
                        System.out.println("No tienes este ticket");
                    }
                }
                else{
                    System.out.println("Ingresa a un cliente que este en el menu");
                }
            }
            else{
                System.out.println("Ingresa una opcion dentro del menu");
            }
        }
    }
}
