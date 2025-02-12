
package work;

import java.util.ArrayList;
import java.util.Scanner;


public class Franco {
    public static void main(String[] args) {
        
        System.out.println("---------------------------------------------------");
        System.out.println("BIENVENIDO AL DEPARTAMENTO ACADEMICO DE CAMPUSLANDS");
        System.out.println("---------------------------------------------------");
        System.out.println("");
        
        
        
        ArrayList<estudiantes> listaEstudiante = new ArrayList<>();
        
        estudiantes estudiante1 = new estudiantes("1", "franco", "guerrero", "100099", "excelente", "java", "pedro");
        estudiantes estudiante2 = new estudiantes("2", "camilo", "lizaraso", "100099", "peligro", "java", "stiven");
        estudiantes estudiante3 = new estudiantes("3", "andres", "martinez", "100099", "inscrito", "java", "pedro");
        estudiantes estudiante4 = new estudiantes("4", "sebastiam", "guerrero", "100099", "incrito", "java", "stiven");
        
        listaEstudiante.add(estudiante1);
        listaEstudiante.add(estudiante2);
        listaEstudiante.add(estudiante3);
        listaEstudiante.add(estudiante4);
        
        
        boolean bo = true;
        
        while(bo == true){
            System.out.println("Que rol tienes dentro de campus");
            System.out.println("1. Coordinador");
            System.out.println("2. Trainer");
            System.out.println("3. Camper");
            
            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();
            
            
            
            if(opcion == 1){
                System.out.println("");
                System.out.println("----------------------");
                System.out.println("BIENVENIDO COORDINADOR");
                System.out.println("----------------------");
                System.out.println("");
                System.out.println("1. Inscribir postulados");
                System.out.println("2. Ingresar nota campers");
                System.out.println("3. Ver campers en peligro");
                
                int opCoordinador = sc.nextInt();
                
                if(opCoordinador == 1){
                    System.out.println("--------------------");
                    System.out.println("INSCRIBIR POSTULADOS");
                    System.out.println("--------------------");
                    System.out.println("");
                    
                    
                    System.out.println("Ingresa el id: ");
                    String idPostulado = sc.nextLine();
                    
                    System.out.println("Ingresa el nombre");
                    String nombrePostulado = sc.nextLine();
                    
                    System.out.println("Ingresa el apellido: ");
                    String apellidoPostulado = sc.nextLine();
                    
                    System.out.println("Ingresa el cedula: ");
                    String cedulaPostulado = sc.nextLine();
                    
                    
                    System.out.println("Ingresa la ruta: ");
                    String rutaPostulado = sc.nextLine();
                    
                    System.out.println("Ingresa el Trainer: ");
                    String trainerPostulado = sc.nextLine();
                    
                    estudiantes estudiante5 = new estudiantes(idPostulado, nombrePostulado, apellidoPostulado, cedulaPostulado, "inscrito", rutaPostulado, trainerPostulado);
                    
                    listaEstudiante.add(estudiante5);
                    
                   
                    for (int i = 0; i<listaEstudiante.size();i++){
                        System.out.println(listaEstudiante.get(i).id + " " + listaEstudiante.get(i).nombre + " "+ listaEstudiante.get(i).apellido + " "+ listaEstudiante.get(i).cedula + " " + listaEstudiante.get(i).estado + " " + listaEstudiante.get(i).ruta + " " + listaEstudiante.get(i).trainer);
                    }
                }
                else if(opCoordinador == 2){
                    System.out.println("------------");
                    System.out.println("NOTA CAMPERS");
                    System.out.println("------------");
                    System.out.println("");
                    
                    System.out.println("A que camper deseas añadirle una nota");
                    
                    for (int i = 0; i<listaEstudiante.size();i++){
                        System.out.println(listaEstudiante.get(i).id + " " + listaEstudiante.get(i).nombre + " "+ listaEstudiante.get(i).apellido);
                    }
                    
                    int escogeCamper = sc.nextInt();
                    
                    if(escogeCamper == 1){
                        
                    }
                    else if(escogeCamper == 2){
                        
                    }
                    else if(escogeCamper == 3){
                        
                    }
                    else if(escogeCamper == 4){
                        
                    }
                    System.out.print("Ingresa la nota: ");
                    String nota = sc.nextLine();
                  
                }
                
                
                else if(opCoordinador == 3){
                    System.out.println("------------------");
                    System.out.println("CAMPERS EN PELIGRO");
                    System.out.println("------------------");
                    System.out.println("");
                    
                    
                }
                else {
                    
                }
                   
            }
            else if(opcion == 2){
                
            }
             
        }
        
        
        
        
        
    }
}
