import java.util.Scanner;

/**Queremos guardar los nombres y la edades de los alumnos de un curso. Realiza un programa que
        *introduzca el nombre y la edad de cada alumno. El proceso de lectura de datos terminará cuando se
        *introduzca como nombre un asterisco (*) Al finalizar se mostrará los siguientes datos:
        *Todos lo alumnos mayores de edad.
        *Los alumnos mayores (los que tienen más edad)**/
public class Ejercicio8{
    public static void main(String[] args){
    Scanner nombre = new Scanner (System.in);
        System.out.println("Ingrese nombre:");
        String texto=nombre.next();
        System.out.println("Ingrese edad:");
        int edad=nombre.nextInt();
        if(edad>=18)
        {
            System.out.println("Su edad es: "+edad);
            System.out.println("Usted es mayor de edad ");
        }
        else{
            System.out.println("Su edad es: "+edad);
            System.out.println("Usted es menor de edad "+edad);
        }


    }

}









