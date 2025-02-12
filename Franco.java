
package com.mycompany.franco;


import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Scanner;


public class Franco {
    public static void main(String[] args) {
        
        System.out.println("---------------------------------------------------");
        System.out.println("BIENVENIDO AL DEPARTAMENTO ACADEMICO DE CAMPUSLANDS");
        System.out.println("---------------------------------------------------");
        System.out.println("");
        
        boolean bo = true;
        
        LinkedHashMap<String, String> estudiantes = new  LinkedHashMap<>();
        
        estudiantes.put("id", "1");
        estudiantes.put("nombre", "franco");
        estudiantes.put("apellido", "guerrero");
        estudiantes. put("cedula", "10987646");
        estudiantes.put("estado", "incrito");
        estudiantes.put("ruta", "java");
        estudiantes.put("trainer", "pedro");
        
        LinkedHashMap<String, String> estudiantes1 = new  LinkedHashMap<>();
        
        estudiantes1.put("id", "");
        estudiantes1.put("nombre", "");
        estudiantes1.put("apellido", "");
        estudiantes1. put("cedula", "");
        estudiantes1.put("estado", "");
        estudiantes1.put("ruta", "");
        estudiantes1.put("trainer", "");

        for (Map.Entry<String, String> entry : estudiantes.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        
        
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
                    
                    System.out.print("Ingresa el id: ");
                    String idPostulado = sc.nextLine();
                    estudiantes1.put("id",idPostulado);
                    
                    System.out.print("Ingresa el nombre: ");
                    String nombrePostulado = sc.nextLine();
                    estudiantes1.put("id",nombrePostulado);
                    
                    System.out.print("Ingresa el apellido: ");
                    String apellidoPostulado = sc.nextLine();
                    estudiantes1.put("id",apellidoPostulado);
                    
                    System.out.print("Ingresa el cedula: ");
                    String cedulaPostulado = sc.nextLine();
                    estudiantes1.put("id",cedulaPostulado);
                    
                    
                    String estadoPostulado = sc.nextLine();
                    estudiantes1.put("id","inscrito");
                    
                    System.out.print("Ingresa la ruta: ");
                    String rutaPostulado = sc.nextLine();
                    estudiantes1.put("id",rutaPostulado);
                    
                    System.out.print("Ingresa el Trainer: ");
                    String trainerPostulado = sc.nextLine();
                    estudiantes1.put("id",trainerPostulado);
                }
                
                
                else if(opCoordinador == 2){
                    System.out.println("------------");
                    System.out.println("NOTA CAMPERS");
                    System.out.println("------------");
                    System.out.println("");
                    
                    System.out.print("Ingresa la nota: ");
                    String nota = sc.nextLine();
                    estudiantes1.put("id",nota);
                }
                
                
                else if(opCoordinador == 3){
                    System.out.println("------------------");
                    System.out.println("CAMPERS EN PELIGRO");
                    System.out.println("------------------");
                    System.out.println("");
                    
                    
                    String peligro = estudiantes.get("nombre");
                    System.out.println("estas en peligro"+ peligro);
                   
                }
                else {
                    
                }
                
                
            }
             
        }
        
        
        
        
        
    }
}
