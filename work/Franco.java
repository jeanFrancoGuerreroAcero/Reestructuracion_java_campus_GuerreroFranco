
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
            
            boolean coordinador = true;
            while(coordinador == true){
                if(opcion == 1){
                    System.out.println("");
                    System.out.println("----------------------");
                    System.out.println("BIENVENIDO COORDINADOR");
                    System.out.println("----------------------");
                    System.out.println("");
                    System.out.println("1. Inscribir postulados");
                    System.out.println("2. Ingresar nota campers");
                    System.out.println("3. Ver campers");
                    System.err.println("4. eliminar camper");
                    System.out.println("5. Cerra sesion");

                    int opCoordinador = sc.nextInt();

                    if(opCoordinador == 1){
                        System.out.println("--------------------");
                        System.out.println("INSCRIBIR POSTULADOS");
                        System.out.println("--------------------");
                        System.out.println("");


                        System.out.println("Ingresa el id: ");
                        String idPostulado = sc.nextLine();

                        sc.nextLine();

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

                        switch (escogeCamper) {
                            case 1:
                                System.out.println("ingresa la nueva nota :");
                                sc.nextLine();
                                String nuevoNombre = sc.nextLine();
                                estudiante1.setu(nuevoNombre);
                                System.out.println("La nota fue cambiado a "+ estudiante1.getuser());

                                for (int i = 0; i<listaEstudiante.size();i++){
                                System.out.println(listaEstudiante.get(i).nombre);
                                }
                                break;
                            case 2:
                                System.out.println("ingresa la nueva nota :");
                                sc.nextLine();
                                String nuevoNombre1 = sc.nextLine();
                                estudiante2.setu(nuevoNombre1);
                                System.out.println("La nota fue cambiado a "+ estudiante1.getuser());

                                for (int i = 0; i<listaEstudiante.size();i++){
                                System.out.println(listaEstudiante.get(i).nombre);
                                }
                                break;
                            case 3:
                                System.out.println("ingresa la nueva nota :");
                                sc.nextLine();
                                String nuevoNombre2 = sc.nextLine();
                                estudiante2.setu(nuevoNombre2);
                                System.out.println("la nota fue cambiada a "+ estudiante2.getuser());

                                for (int i = 0; i<listaEstudiante.size();i++){
                                System.out.println(listaEstudiante.get(i).nombre);
                                }
                                break;
                            case 4:
                                System.out.println("ingresa la nueva nota :");
                                sc.nextLine();
                                String nuevoNombre3 = sc.nextLine();
                                estudiante3.setu(nuevoNombre3);
                                System.out.println("La nota fue cambiada a "+ estudiante3.getuser());

                                for (int i = 0; i<listaEstudiante.size();i++){
                                System.out.println(listaEstudiante.get(i).nombre);
                                }
                                break;
                            case 5:
                                System.out.println("ingresa la nueva nota :");
                                sc.nextLine();
                                String nuevoNombre4 = sc.nextLine();
                                estudiante4.setu(nuevoNombre4);
                                System.out.println("La nota fue cambiado a "+ estudiante4.getuser());

                                break;
                            default:
                                throw new AssertionError();
                        }
                    }
                    else if(opCoordinador == 3){
                        System.out.println("----------");
                        System.out.println("VER CAMPER");
                        System.out.println("----------");
                        System.out.println("");

                        for (int i = 0; i<listaEstudiante.size();i++){
                            System.out.println(listaEstudiante.get(i).id + " " + listaEstudiante.get(i).nombre + " "+ listaEstudiante.get(i).apellido);
                        }
                    }
                    else if(opCoordinador == 4){
                        System.out.println("---------------");
                        System.out.println("ELIMINAR CAMPER");
                        System.out.println("---------------");
                        System.out.println("");

                        System.out.println("A que camper deseas eliminar");

                        for (int i = 0; i<listaEstudiante.size();i++){
                            System.out.println(listaEstudiante.get(i).id + " " + listaEstudiante.get(i).nombre + " "+ listaEstudiante.get(i).apellido);
                        }

                        int elimiCamper = sc.nextInt();

                        switch (elimiCamper) {
                            case 1:
                                System.out.println("el camper " + estudiante1.nombre);
                                listaEstudiante.remove(estudiante1);
                                break;
                            case 2:
                                System.out.println("el camper " + estudiante2.nombre);
                                listaEstudiante.remove(estudiante2);
                                break;
                            case 3:
                                System.out.println("el camper " + estudiante3.nombre);
                                listaEstudiante.remove(estudiante3);
                                break;
                            case 4:
                                System.out.println("el camper " + estudiante4.nombre);
                                listaEstudiante.remove(estudiante4);
                                break;
                            default:
                                throw new AssertionError();
                        }           
                    }
                    else if(opCoordinador == 5){
                        System.out.println("Vuelve pronto coordinador");
                        coordinador = false;
                    }
                    else {
                        System.out.println("");
                        System.out.println("Ingresa una opcion que este en el menu");
                    }
                }
                else if(opcion == 2){
                    System.out.println("------------------");
                    System.out.println("BIENVENIDO TRAINER");
                    System.out.println("------------------");
                    System.out.println("");
                    
                    System.out.println("Que opcion quieres realizar :");
                    System.out.println("1. Ver campers");
                    
                    int optrainer = sc.nextInt();
                    
                    switch (optrainer) {
                        case 1:
                            for (int i = 0; i<listaEstudiante.size();i++){
                                System.out.println("-" + listaEstudiante.get(i));
                            }
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
                else if(opcion == 3){
                    System.out.println("-----------------");
                    System.out.println("BIENVENIDO CAMPER");
                    System.out.println("-----------------");
                    System.out.println("");
                    
                    System.out.println("TRAINER DISPONIBLES");
                    System.out.println("1. PEDRO");
                    System.out.println("2. JOSE");
                    System.out.println("3. JHOLVER");
                }    
            }
        } 
    }
}
