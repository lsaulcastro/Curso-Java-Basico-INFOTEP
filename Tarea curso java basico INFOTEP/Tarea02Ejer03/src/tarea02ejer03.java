/*
 Se quiere realizar una aplicación para que cada profesor de la universidad gestione las

fichas de sus alumnos. Un profesor puede impartir una o varias asignaturas, y dentro de

cada asignatura puede tener distintos grupos de alumnos. Los alumnos pueden

ser presenciales o a distancia. Al comenzar las clases, se entrega al profesor un

listado con los alumnos por cada asignatura. Escribir un programa de tal forma que el

listado de alumnos se introduzca por teclado y se den de alta calificaciones de exámenes o

prácticas realizadas. Se podrá obtener listados de calificaciones y porcentajes de

aprobados una vez realizados los exámenes.
 */
import java.util.Scanner;
public class tarea02ejer03 {

    //NOTA LO DE AGREGAR ALUMNOS, ESTA LISTO AL 100%... SOLO FALTO LO DE CORREGIR, EXAMENES Y ASIGNARLE CALIFICACION
    public static void main(String[] args) {
        //NOTA LO DE AGREGAR ALUMNOS, ESTA LISTO AL 100%... SOLO FALTO LO DE CORREGIR, EXAMENES Y ASIGNARLE CALIFICACION
        
       //A = Alumno B = Profesores y C = Asignatura
       Scanner Leer = new Scanner(System.in);
       Alumnos A[] = new Alumnos[3];
       Alumnos a = new Alumnos();
       Profesores B = new Profesores();
       Asignatura C = new Asignatura();
       int p = 0;
       int _Op = 0;
        int b = 0;
       boolean salir = false;
       do{
        System.out.println("        *Menu Gestion de alumnos*      \n1.Agregar Alumnos \n2.Calificar Alumno \n.0.Salir \n  *Por Favor, Seleccione la opcion deseada: ");
        try {
            _Op = Leer.nextInt();
        } catch (Exception e) {
            System.out.println("Error... solo se admite dato de tipo entero "+ e);
        }
        
        switch(_Op){
        
            case 1:
                System.out.println("        *Altas alumnos*         \n  *Por favor, Ingrese cuantos estudiantes tendra la lista de alumnos: \n(TIENE UN LIMITE DE 4 ALUMNOS POR LISTA)");
                try {
                   
                    b = Leer.nextInt();
                } catch (Exception e) {
                    System.out.println("Error... solo se admite dato de tipo entero "+ e);

                }
                for (int  i = 1; i <= b; i++) {
                    Leer.nextLine();
                    System.out.println("Nombre: "); String nom = Leer.nextLine();
                    System.out.println("Apellido: "); String ape = Leer.nextLine();
                    System.out.println("edad: "); int ed = Leer.nextInt();Leer.nextLine();
    
                   A[i] = new Alumnos(nom, ape, ed, i);
                  /*Por que usaron ARRAYS..........................................................................
                 EH!
                   */
                }
                System.out.println("Usted ingreso los siguientes datos: \n_______________________");
                for (int i = 1; i <= b; i++) {
                    A[i].mostrarAlumnos();
                }
                
                    System.out.println("\n 0.Salir \nOtro numero volver al menu");
                    int o = Leer.nextInt();
                    if (o == 0) {
                    salir = true;
                }
                break;
                
            case 2:
                System.out.println("    Calificar Alumno    \n  *Por Favor ingrese el ID del alumno: ");
                
               p = Leer.nextInt();
               
                System.out.println("Ingrese la calificacion: ");
                int z = 0;
                z = Leer.nextInt();
                   z = C.Calificacion[p];
                 A[p].mostrarAlumnos();
                 System.out.println("La calificacion del alumno es: " + C.Calificacion[p]);
                
                break;
        
        
        }
       }while(salir != true);
    }
    
}
